import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test_DELETE {
	
	@Test
	public void test2()
	{
	
	given()
	
	.when()
	  .delete("https://reqres.in/api/users/2")
	.then()
	  .statusCode(204).log().all();
	
	}

}
