import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
public class Test_POST {
	
	@Test
	public void test()
	{
		JSONObject json = new JSONObject();
		
		json.put("name", "Niraj");
		json.put("job", "Engineer");
		
		System.out.println(json.toJSONString());
		
		given()
		.header("Content-Type" ,"application/json")
		.body(json.toJSONString())
		.when()
		  .post("https://reqres.in/api/users")
		  .then().
		  statusCode(201).log().all();
		
	}

}
