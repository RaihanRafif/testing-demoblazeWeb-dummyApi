package helper;

import Pages.ApiPage;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static helper.Utility.generateRandomEmail;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Models extends ApiPage {

    private static RequestSpecification request;

    public static void setupHeaders() {
        request = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("app-id", "658edadf937c487c0bb850fd");
    }

    public static void setupHeadersForInvalidToken() {
        request = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("app-id", "invalidtokeninvalid");
    }

    public static void setupHeadersWithNoAuth() {
        request = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json");
    }

    public static Response getListUsers(String endpoint) {
        setupHeaders();
        return request.when().get(endpoint);
    }

    public static Response getListPosts(String endpoint) {
        setupHeaders();
        return request.when().get(endpoint);
    }

    public static Response getListUsersWithInvalidToken(String endpoint) {
        setupHeadersForInvalidToken();
        return request.when().get(endpoint);
    }

    public static Response getListUsersWithNoAuth(String endpoint) {
        setupHeadersWithNoAuth();
        return request.when().get(endpoint);
    }

    public static Response postCreateUser(String endpoint) {
        String firstName = "Raihan firstName";
        String lastName = "Raihan LastName";
        String email = generateRandomEmail();
        JSONObject payload = new JSONObject();
        payload.put("firstName", firstName);
        payload.put("lastName", lastName);
        payload.put("email", email);

        setupHeaders();
        String finalEndpoint = endpoint + "/create";
        return request.body(payload.toString()).when().post(finalEndpoint);
    }

    public static Response postCreatePost(String endpoint) {
        String userId = "60d0fe4f5311236168a109ca";
        String image = "http://linkImage";
        String text = "this is text of the post";
        JSONObject payload = new JSONObject();
        payload.put("owner", userId);
        payload.put("image", image);
        payload.put("text", text);

        setupHeaders();
        String finalEndpoint = endpoint;
        return request.body(payload.toString()).when().post(finalEndpoint);
    }

    public static Response postCreatePostWithInvalidUserId(String endpoint) {
        String userId = "invalid_user_id";
        String image = "http://linkImage";
        String text = "this is text of the post";
        JSONObject payload = new JSONObject();
        payload.put("owner", userId);
        payload.put("image", image);
        payload.put("text", text);

        setupHeaders();
        String finalEndpoint = endpoint;
        return request.body(payload.toString()).when().post(finalEndpoint);
    }

    public static Response postCreateUserDuplicate(String endpoint) {
        String firstName = "Raihan Firstname";
        String lastName = "male";
        String email = "emailcobacoba123@gmail.com";
        JSONObject payload = new JSONObject();
        payload.put("firstName", firstName);
        payload.put("lastName", lastName);
        payload.put("email", email);

        setupHeaders();
        String finalEndpoint = endpoint + "/create";
        return request.body(payload.toString()).when().post(finalEndpoint);

    }

    public static Response deleteUser(String endpoint, String global_id) {
        setupHeaders();


        // Menggunakan nilai "id" dari operasi POST untuk operasi DELETE
        String finalEndpoint = endpoint + "/" + global_id;
        // // System.out.println(finalEndpoint);

        // Melakukan permintaan DELETE dan mengembalikan respons
        return request.when().delete(finalEndpoint);
//
//        String finalEndpoint = endpoint + "/" + user_id;
//        // System.out.println(finalEndpoint);
//        return request.when().delete(finalEndpoint);
    }

    public static Response deleteUserNonExistent(String endpoint) {
        setupHeaders();


        // Menggunakan nilai "id" dari operasi POST untuk operasi DELETE
        String finalEndpoint = endpoint + "/";
        // System.out.println(finalEndpoint);

        // Melakukan permintaan DELETE dan mengembalikan respons
        return request.when().delete(finalEndpoint);
//
//        String finalEndpoint = endpoint + "/" + user_id;
//        // System.out.println(finalEndpoint);
//        return request.when().delete(finalEndpoint);
    }

    public static Response updateUser(String endpoint, String global_id) {
        setupHeaders();

        String firstName = "raihan update";
        JSONObject payload = new JSONObject();
        payload.put("firstName", firstName);

        String finalEndpoint = endpoint + "/" + global_id;
        // System.out.println(finalEndpoint);
        return request.body(payload.toString()).when().put(finalEndpoint);
    }

    public static Response updateNonExistentUser(String endpoint) {
        setupHeaders();

        String firstName = "raihan update";
        JSONObject payload = new JSONObject();
        payload.put("firstName", firstName);

        String finalEndpoint = endpoint + "/" + "usernotvalid";
        // System.out.println(finalEndpoint);
        return request.body(payload.toString()).when().put(finalEndpoint);
    }


    public static Response postCreateUserWithMissingFields(String endpoint) {
        String firstName = "raihan firstname";
        String email = generateRandomEmail();
        JSONObject payload = new JSONObject();
        payload.put("firstName", firstName);
        payload.put("email", email);

        setupHeaders();
        String finalEndpoint = endpoint + "/create";
        return request.body(payload.toString()).when().post(finalEndpoint);


    }

    public static Response deletePost(String endpoint, String global_id) {
        setupHeaders();
        String finalEndpoint = endpoint + "/" + global_id;
        // System.out.println(finalEndpoint);

        // Melakukan permintaan DELETE dan mengembalikan respons
        return request.when().delete(finalEndpoint);

    }

}
