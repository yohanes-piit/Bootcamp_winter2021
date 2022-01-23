package ApI_Bootcamp;

import static io.restassured.RestAssured.*;

import org.testng.Assert;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class API_GET_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response response= get("https://reqres.in/api/users?page=2");
		response. prettyPrint();
		int statusof= response.statusCode();
		System.out.println(statusof);
		Assert.assertEquals(statusof, 200);
		ResponseBody verifay= response.getBody();
		String converts= verifay.asString();
		Assert.assertEquals(converts.contains("Funke"), true);
	}

}
