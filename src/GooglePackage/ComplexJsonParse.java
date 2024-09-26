package GooglePackage;

import DataFiles.LocationPayload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JsonPath js = new JsonPath (LocationPayload.CourseAvailable());
		
		//Print number of courses
		int count = js.getInt("courses.size()");
		System.out.println(count);
		
		//Print purchase amount 
		int purchaseAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println(purchaseAmount);
		
		//Print first course
		String FirstCourse = js.get("courses[0].title");
		int pricefirstcourse = js.getInt("courses[0].price");
		System.out.println (FirstCourse);
		System.out.println (pricefirstcourse);
		
		//Print all available courses and their price
		for (int i=0; i<count; i++)
				{
				String courseTitles = js.get("courses["+i+"].title");
				System.out.println(courseTitles);
				// printing without storing into a variable
				System.out.println(js.get("courses["+i+"].price").toString());			
				}
		//Print number of copies sold by RPA course
		System.out.println ("Number of copies sold by RPA");
		for (int i=0; i<count; i++)
		{
		String courseTitles = js.get("courses["+i+"].title");
		if (courseTitles.equalsIgnoreCase("rpa"))
		{
			// Copies sold
		int soldcopies = js.get("courses["+i+"].copies");
		System.out.println (soldcopies);
		break;
		}
		}
	}

}
