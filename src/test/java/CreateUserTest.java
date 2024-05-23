import models.CreateUserMap;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import requests.Requests;

public class CreateUserTest {
    String userName = "Edison";
    String job ="Analista QA";
    int statusCode;

    @Test(groups = "criar usuario")
    public void testCreateUser(){
        //Efetua chamada que "cria" novo usuário
        Response createuResponse = Requests.createUser(userName,job);

        //Campos mapeados
        CreateUserMap createUserModel = createuResponse.as(CreateUserMap.class);
        SoftAssert softAssert = new SoftAssert();

        //Valida se o StatusCode retornado é 201
        softAssert.assertEquals(createuResponse.getStatusCode(), 201);

        //Valida se os valores retornados pela API
        softAssert.assertEquals(createUserModel.getName(),"Edison");
        softAssert.assertEquals(createUserModel.getJob(),"Analista QA");

        //Apresenta no Console Log os valores retornados
        System.out.println("statusCode: " + createuResponse.getStatusCode());
        System.out.println("name: " + createUserModel.getName());
        System.out.println("job: " + createUserModel.getJob());
        System.out.println("id: " + createUserModel.getId());
        System.out.println("createdAt: " + createUserModel.getCreatedAt());
        softAssert.assertAll();
    }
}