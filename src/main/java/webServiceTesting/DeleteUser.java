package webServiceTesting;

import static io.restassured.RestAssured.given;

public class DeleteUser {

	public void DeleteById(String uri) {

		given().
		when().
		delete(uri).
		then().
		statusCode(204).
		log().
		all();

	}
}
