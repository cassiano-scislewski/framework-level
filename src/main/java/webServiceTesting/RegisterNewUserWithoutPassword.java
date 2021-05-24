package webServiceTesting;

import static io.restassured.RestAssured.given;

import org.junit.Assert;

import io.restassured.http.ContentType;
import io.restassured.response.*;

public class RegisterNewUserWithoutPassword {
	
	  private String email;
	  String response;
		
	  public void setEmail(String email) {
		    this.email = email;
		  }
	
	public  void NewUserWithoutPassword(String uri) {
		
		String jsonWithoutPassword = "{\n" + "    \"email\": \"" +email+ "\"\n" + "}";		

		ValidatableResponse response_ =	given().
				contentType(ContentType.JSON).
				body(jsonWithoutPassword).
				when().
				post(uri).
				then().			
				log().all().
				assertThat().statusCode(400);
			
				response = response_.extract().jsonPath().get("error");
					
	}
	
	 public void Assertresponse() {
		    Assert.assertEquals("Missing password", response);
		  }
	
}
