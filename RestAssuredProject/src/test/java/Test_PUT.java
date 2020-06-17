import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test_PUT {
	
	@Test
	public void test1()
	{JSONObject json = new JSONObject();
	
	json.put("name", "Niraj");
	json.put("job", "Engineer");
	
	System.out.println(json.toJSONString());
	
	given()
	.header("Content-Type" ,"application/json")
	.body(json.toJSONString())
	.when()
	  .put("https://reqres.in/api/users")
	  .then().statusCode(200).log().all();
	
	}

}
