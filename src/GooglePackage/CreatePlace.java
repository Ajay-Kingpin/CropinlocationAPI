package GooglePackage;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.Assert;
import DataFiles.LocationPayload;
import DataFiles.ReusableMethods;

public class CreatePlace {
	public static void main (String args []){
		// TODO Auto-generated method stub
				//Given = all input details
				//When = Submit the API
				//Then = Validate / execute the response
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body(LocationPayload.AddPlace())
		.when().post("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200)
		.header("Server", "Apache/2.4.52 (Ubuntu)").body("scope", equalTo("APP"))
		.extract().response().asString();
		System.out.println(response);
		JsonPath js = new JsonPath(response); // Parsing String response to Json
		String placeid = js.getString("place_id");
		System.out.println(placeid);
		
		//Update location with new address
		String newAdress = "Aerospace bengaluru";
		
		given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+placeid+"\",\r\n"
				+ "\"address\":\""+newAdress+",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}")
		.when().put("maps/api/place/get/json")
		.then().assertThat().log().all().statusCode(200);
		
		// Get updated location
		String GetPlaceResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeid)
		.when().get("maps/api/place/get/json")
		.then().assertThat().log().all().statusCode(200).extract().response().asString();
		System.out.println(GetPlaceResponse);
		
		JsonPath js1 = ReusableMethods.rawtoJson(GetPlaceResponse);
		String Actualaddress = js1.getString("address");
		System.out.println ("Actualaddress");
		Assert.assertEquals("Actualaddress","Actualaddress");		
	}	
	// add place > update place with new address > validate whether updated address is present
	}
