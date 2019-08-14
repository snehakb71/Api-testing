package apiSne;

import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class Apiweather {

	@Test
	public void test12() {
		// get("api.openweathermap.org/data/2.5/weather?q=London,uk");
		Response resp = given().param("token", "ceb3dce8b4c02aa49d736d68115bca8e761b1229").when()
				.get("http://10.0.0.73/jobs/job_dashboard");
		System.out.println(resp.getStatusCode());
		System.out.println("sneha" + resp);
		System.out.println(resp.asString());
	}
}
