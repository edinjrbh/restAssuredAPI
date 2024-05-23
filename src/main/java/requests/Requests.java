package requests;

import helper.Helper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import models.CreateUserMap;



public class Requests {
    public static String baseUrl="https://reqres.in/api";
    public static String createSingleUserEndpoint="/users";

    public static Response createUser(String name,String job){
        CreateUserMap createUserRequest = new CreateUserMap();
        createUserRequest.setJob(job);
        createUserRequest.setName(name);
        return RestAssured
                .given().contentType("application/json")
                    .body(Helper.getObjectAsString(createUserRequest))
                .when()
                    .post(baseUrl+createSingleUserEndpoint);
    }
}
