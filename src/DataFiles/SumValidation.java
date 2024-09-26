package DataFiles;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.path.json.JsonPath;
@Test

public class SumValidation {
	
	// public void sumofcourses() check from updating GIT
	public static void main(String[] args){ 
	{
		int sum = 0;
		JsonPath js = new JsonPath (LocationPayload.CourseAvailable());
		int count = js.getInt("courses.size()");
		for (int i=0; i<count; i++)
		{
			int courseprice = js.getInt("courses["+i+"].price");
			int coursecopies = js.getInt("courses["+i+"].copies");
			int totalAmt = courseprice*coursecopies;
			System.out.println (totalAmt);
			sum = sum + totalAmt;
		}
		System.out.println (sum);
		int Totalpurchaseamount = js.getInt("dashboard.purchaseAmount");
		Assert.assertEquals(sum, Totalpurchaseamount);
		System.out.println (Totalpurchaseamount);
	}
	}
}
