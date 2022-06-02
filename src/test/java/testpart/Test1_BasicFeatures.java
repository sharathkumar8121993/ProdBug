package testpart;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Test1_BasicFeatures {

    /**
     * checking the status code
     */
    @Test
    public void testStatusCode(){
        given().get("https://reqres.in/api/users?page=2").then().statusCode(200).log().all();


    }
}
