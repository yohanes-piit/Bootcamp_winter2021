package ApI_Bootcamp;
import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.Assert;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
public class API_POST_Method {

	public static void main(String[] args) {
		File fi= new File("C:\\Users\\mmyoh\\eclipse-workspace\\8480IL_yohanes_API\\post.json");
		Response res= given().contentType(ContentType.JSON).body(fi).post("https://reqres.in/api/users");
		res.prettyPrint();
		int code=res.statusCode();
		System.out.println(code);
		Assert.assertEquals(code, 201);
		ResponseBody verifay= res.getBody();
		String convert= verifay.asString();
		Assert.assertEquals(convert.contains("morpheus"),true);
		
		

	}

}
