package webServiceTesting;

import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;

public class CreateUser {

  private String name;
  private String job;
  
  public void CreateUserNameAndJob(String uri) {
	  
	  	String jsonWithUserAndJob = "{\n" + "    \"name\": \"" +name+"\",\n" + "    \""+job+"\": \"testJob\"\n" + "}";
		
	  	given().contentType(ContentType.JSON).
		body(jsonWithUserAndJob).
		when().post(uri).
		then().
		statusCode(201).
		log().
		all();	
	  		  	
  }

 

  public void setName(String name) {
    this.name = name;
  }

  public void setJob(String job) {
    this.job = job;
  }


}
