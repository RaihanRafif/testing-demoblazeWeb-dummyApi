package Pages;

import helper.Endpoint;
import helper.Utility;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.runner.Request;

import java.io.File;
import java.util.List;
import java.util.Map;

import static helper.Models.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ApiPage {

    String setURL;
    String global_id;

    Response res;
    Request req;



    public void prepareURLFor(String url) {
        switch (url) {
            case "GET_LIST_USERS":
                setURL = Endpoint.GET_LIST_USERS;
                break;
            case "CREATE_NEW_USER":
                setURL = Endpoint.CREATE_NEW_USER;
                break;
            case "DELETE_USER":
                setURL = Endpoint.DELETE_USER;
                break;
            case "UPDATE_USER":
                setURL = Endpoint.UPDATE_USER;
                break;
            case "GET_LIST_POST":
                setURL = Endpoint.GET_LIST_POST_BY_USER_ID;
                break;
            case "GET_LIST_POST_INVALID_USER_ID":
                setURL = Endpoint.GET_LIST_POST_INVALID_USER_ID;
                break;
            case "GET_POST_BY_POST_ID":
                setURL = Endpoint.GET_POST_BY_POST_ID;
                break;
            case "GET_POST_BY_INVALID_POST_ID":
                setURL = Endpoint.GET_POST_BY_INVALID_POST_ID;
                break;
            case "CREATE_NEW_POST":
                setURL = Endpoint.CREATE_NEW_POST;
                break;
            case "DELETE_POST":
                setURL = Endpoint.DELETE_POST;
                break;
            case "INVALID_ENDPOINT":
                setURL = Endpoint.INVALID_ENDPOINT;
                break;


        }
    }

    public void hitApiGetListUsers() {
        res = getListUsers(setURL);
////        System.out.println(res.getBody().asString());
    }

    public void hitApiGetListPost() {
        res = getListPosts(setURL);
//        System.out.println(res.getBody().asString());
    }

    public void hitApiGetListUsersWithInvalidToken() {
        res = getListUsersWithInvalidToken(setURL);
//        System.out.println(res.getBody().asString());

    }

    public void hitApiGetListUsersWithNoAuth() {
        res = getListUsersWithNoAuth(setURL);
//        System.out.println(res.getBody().asString());

    }

    public void hitApiPostCreateUser() {
        res = postCreateUser(setURL);
        JsonPath jsonPathEvaluator = res.jsonPath();
        global_id = jsonPathEvaluator.get("id");

    }

    public void hitApiPostCreateUserWithMissingFields() {
        res = postCreateUserWithMissingFields(setURL);
        JsonPath jsonPathEvaluator = res.jsonPath();
        global_id = jsonPathEvaluator.get("id");
//        System.out.println("New user ID: " + global_id);
////        System.out.println(res.getBody().asString());

    }

    public void hitApiPostCreateUserDuplicate() {
        res = postCreateUserDuplicate(setURL);
        JsonPath jsonPathEvaluator = res.jsonPath();
        global_id = jsonPathEvaluator.get("id");
//        System.out.println("New user ID: " + global_id);
////        System.out.println(res.getBody().asString());

    }


    public void hitApiDeleteUser() {
        if (global_id != null) {
            res = deleteUser(setURL, global_id);
    //        System.out.println(res.getBody().asString());
        } else {
            System.out.println("Error: Global ID is null. Please ensure it is set before attempting to delete.");
        }
    }


    public void hitApiUpdateUser() {
        res = updateUser(setURL, global_id);
//        System.out.println(res.getBody().asString());

    }

    public void hitApiUpdateNonExistentUser() {
        res = updateNonExistentUser(setURL);
//        System.out.println(res.getBody().asString());

    }



    public void hitApiDeleteNonExistentUser() {
        res = deleteUserNonExistent(setURL);
//        System.out.println(res.getBody().asString());


    }


    public void validationStatusCodeIsEquals(int status_code) {
        assertThat(res.statusCode()).isEqualTo(status_code);
    }


    public void validationResponseBodyGetListUsers() {
        JsonPath jsonPath = res.jsonPath();

        List<Object> idList = jsonPath.getList("data.id");
        List<Object> titleList = jsonPath.getList("data.title");
        List<Object> firstNameList = jsonPath.getList("data.firstName");
        List<Object> lastNameList = jsonPath.getList("data.lastName");
        List<Object> pictureList = jsonPath.getList("data.picture");

        // Validasi elemen pertama dari setiap daftar
        assertThat(getFirstElement(idList)).isNotNull();
        assertThat(getFirstElement(titleList)).isNotNull();
        assertThat(getFirstElement(firstNameList)).isNotNull();
        assertThat(getFirstElement(lastNameList)).isNotNull();
        assertThat(getFirstElement(pictureList)).isNotNull();
    }

    public void validationResponseBodyGetListPosts(){
        JsonPath jsonPath = res.jsonPath();
        List<Object> idList = jsonPath.getList("data.id");
        List<Object> titleList = jsonPath.getList("data.title");
        List<Object> firstNameList = jsonPath.getList("data.firstName");
        List<Object> lastNameList = jsonPath.getList("data.lastName");
        List<Object> pictureList = jsonPath.getList("data.picture");

        // Validasi elemen pertama dari setiap daftar
        assertThat(getFirstElement(idList)).isNotNull();
        assertThat(getFirstElement(titleList)).isNotNull();
        assertThat(getFirstElement(firstNameList)).isNotNull();
        assertThat(getFirstElement(lastNameList)).isNotNull();
        assertThat(getFirstElement(pictureList)).isNotNull();
    }

    private Object getFirstElement(List<Object> list) {
        return list.isEmpty() ? null : list.get(0);
    }


    public void validationResponseJsonWithJSONSchema(String filename) {
        File JSONFile = Utility.getJSONSchemaFile(filename);
        res.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JSONFile));
    }

    public void validationResponseBodyCreateNewUser(){
        JsonPath jsonPathEvaluator = res.jsonPath();
        String id = global_id;
        String firstName = jsonPathEvaluator.get("firstName");
        String lastName = jsonPathEvaluator.get("lastName");
        String email = jsonPathEvaluator.get("email");
        String registerDate = jsonPathEvaluator.get("registerDate");
        String updatedDate = jsonPathEvaluator.get("updatedDate");

        // Validasi bahwa nilai tidak null
        assertThat(firstName).isNotNull().withFailMessage("Nama Depan tidak boleh null");
        assertThat(lastName).isNotNull().withFailMessage("Nama Belakang tidak boleh null");
        assertThat(email).isNotNull().withFailMessage("Email tidak boleh null");
        assertThat(registerDate).isNotNull().withFailMessage("Tanggal Registrasi tidak boleh null");
        assertThat(updatedDate).isNotNull().withFailMessage("Tanggal Update tidak boleh null");

        // Validasi format tanggal (contoh: format harus ISO8601)
        assertThat(registerDate).matches("\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}.\\d{3}Z")
                .withFailMessage("Format Tanggal Registrasi tidak sesuai");

        assertThat(updatedDate).matches("\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}.\\d{3}Z")
                .withFailMessage("Format Tanggal Update tidak sesuai");

    }

    public void validationResponseBodyUpdateUser() {
        JsonPath jsonPathEvaluator = res.jsonPath();
        String id = jsonPathEvaluator.get("id");
        String firstName = jsonPathEvaluator.get("firstName");
        String lastName = jsonPathEvaluator.get("lastName");
        String email = jsonPathEvaluator.get("email");
        String registerDate = jsonPathEvaluator.get("registerDate");
        String updatedDate = jsonPathEvaluator.get("updatedDate");

        assertThat(id).isNotNull();
        assertThat(firstName).isNotNull();
        assertThat(lastName).isNotNull();
        assertThat(email).isNotNull();
        assertThat(registerDate).matches("\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}.\\d{3}Z")
                .withFailMessage("Format Tanggal Registrasi tidak sesuai");
        assertThat(updatedDate).matches("\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}.\\d{3}Z")
                .withFailMessage("Format Tanggal Update tidak sesuai");


    }

    public void validationResponseBodyIsNotNull(){
        List<Map<String, Object>> dataList = res.jsonPath().getList("data");

        // Asserting that the "data" field is not null
        Assert.assertNotNull("The 'data' field is null in the JSON response", dataList);
    }

    public void hitApiPostCreatePost(){
        res = postCreatePost(setURL);
        String responseBody = res.getBody().asString();
        System.out.println("Response Body:");
        System.out.println(responseBody);

        JsonPath jsonPathEvaluator = res.jsonPath();
        global_id = jsonPathEvaluator.get("id");
    }

    public void hitApiPostCreatePostWithInvalidUserId(){
        res = postCreatePostWithInvalidUserId(setURL);
        String responseBody = res.getBody().asString();
        System.out.println("Response Body:");
        System.out.println(responseBody);

        JsonPath jsonPathEvaluator = res.jsonPath();
        global_id = jsonPathEvaluator.get("id");
    }

    public void validationResponseBodyCreateNewPost(){
        JsonPath jsonPathEvaluator = res.jsonPath();
//        String id = global_id;
        String id = jsonPathEvaluator.get("id");
        String image = jsonPathEvaluator.get("image");
        String text = jsonPathEvaluator.get("text");
        String publishDate = jsonPathEvaluator.get("publishDate");
        String updatedDate = jsonPathEvaluator.get("updatedDate");

        // Validasi bahwa nilai tidak null
        assertThat(id).isNotNull().withFailMessage("id tidak boleh null");
        assertThat(image).isNotNull().withFailMessage("Image tidak boleh null");
        assertThat(text).isNotNull().withFailMessage("Text tidak boleh null");
        assertThat(publishDate).isNotNull().withFailMessage("Tanggal Publish tidak boleh null");
        assertThat(updatedDate).isNotNull().withFailMessage("Tanggal Update tidak boleh null");

        // Validasi format tanggal (contoh: format harus ISO8601)
        assertThat(publishDate).matches("\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}.\\d{3}Z")
                .withFailMessage("Format Tanggal Registrasi tidak sesuai");

        assertThat(updatedDate).matches("\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}.\\d{3}Z")
                .withFailMessage("Format Tanggal Update tidak sesuai");

    }

    public void hitApiPostDeletePost(){
        if (global_id != null) {
            res = deletePost(setURL, global_id);
    //        System.out.println(res.getBody().asString());
        } else {
            System.out.println("Error: Global ID is null. Please ensure it is set before attempting to delete.");
        }
    }

    public void hitApiPostDeletePostWithInvalidPostId(){
        if (global_id != null) {
            res = deletePost(setURL, global_id+"cc");
    //        System.out.println(res.getBody().asString());
        } else {
            System.out.println("Error: Global ID is null. Please ensure it is set before attempting to delete.");
        }
    }
}
