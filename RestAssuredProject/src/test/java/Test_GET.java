import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Test_GET {

	/*
	 * @Test public void test1() { Response response =
	 * get("https://reqres.in/api/users?page=2");
	 * System.out.println(response.getBody().asString());
	 * System.out.println(response.getStatusCode());
	 * System.out.println(response.getStatusLine());
	 * System.out.println(response.getTime());
	 * Assert.assertEquals(response.getStatusCode(), 200); }
	 */
	
	@Test
	public void test2()
	{
		//Assertion 
		/*
		 * given() .get("https://reqres.in/api/users?page=2")
		 * .then().statusCode(200).body("data.id[0]", equalTo(7));
		 */
		
		// Verifying the multiple values for  some tag
		/*
		 * given() .get("https://reqres.in/api/users?page=2")
		 * .then().statusCode(200).body("data.first_name",
		 * hasItems("Michael","Lindsay"));
		 */
		
		given()
		.get("https://reqres.in/api/users?page=2")
		.then()
		 .statusCode(200).log().all();
		
	}
}
