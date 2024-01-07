package helper;

public class Endpoint {
    public static final String default_url = "https://dummyapi.io/data/v1/";
    public static final String INVALID_ENDPOINT = "https://dummyapi.io/data/v1/invalidendpoint";
    //USER
    public static final String GET_LIST_USERS = default_url + "user";

    public static final String CREATE_NEW_USER = default_url + "user";

    public static final String DELETE_USER = default_url + "user";

    public static final String UPDATE_USER = default_url + "user";

    //POST
    public static final String GET_LIST_POST_BY_USER_ID = default_url+"user/60d0fe4f5311236168a109ca/post";

    public static final String GET_LIST_POST_INVALID_USER_ID = default_url+"user/60d0fe4f5311236168a109c/post";

    public static  final String GET_POST_BY_POST_ID = default_url+"user/60d0fe4f5311236168a109ca/post";
    public static  final String GET_POST_BY_INVALID_POST_ID = default_url+"user/invalid_post_id/post";
    public static  final String CREATE_NEW_POST = default_url+"post/create";

    public  static final String DELETE_POST = default_url+"post";

}
