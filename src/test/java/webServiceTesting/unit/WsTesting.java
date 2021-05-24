package webServiceTesting.unit;

import org.junit.Before;
import org.junit.Test;
import io.restassured.RestAssured;
import webServiceTesting.CreateUser;
import webServiceTesting.DeleteUser;
import webServiceTesting.RegisterNewUserWithoutPassword;


public class WsTesting {

	private static final String baseUrl = "https://reqres.in/api";
	private static final String addUser = "/users"; 
	private static final String deleteUser = "/users/"; 
	private static final String registerUser = "/register"; 
	
	DeleteUser delete = new DeleteUser();
	RegisterNewUserWithoutPassword newUserWithoutPassword = new RegisterNewUserWithoutPassword();
	CreateUser createUser = new CreateUser();

	
	@Before
	public void setup() {

		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
	
	}

	@Test
	public void AddUser() {

		String uri = baseUrl + addUser;
		createUser.setName("name1");
		createUser.setJob("job1");
		createUser.CreateUserNameAndJob(uri);

	}

	
	@Test
	public void Delete() {
		
		String idUser = "1";
		String uri = baseUrl + deleteUser+idUser;
		delete.DeleteById(uri);

	}

	
	@Test
	public void RegisterUserWithoutPassword() {

		newUserWithoutPassword.setEmail("email@mail.com");
		String uri = baseUrl + registerUser;
		newUserWithoutPassword.NewUserWithoutPassword(uri);
		newUserWithoutPassword.Assertresponse();
		
	}

}
