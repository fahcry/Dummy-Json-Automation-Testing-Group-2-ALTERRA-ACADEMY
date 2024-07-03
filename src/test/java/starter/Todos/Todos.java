package starter.Todos;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Constants;

import java.io.File;

public class Todos {
    public static String ALL_TODOS = Constants.BASE_URL+ "/todos";
    public static String ALL_TODOS_BY_USER_ID = Constants.BASE_URL+ "/todos/user/{userId}";
    public static String SINGLE_TODOS = Constants.BASE_URL+ "/todos/{id}";
    public static String RANDOM_TODOS = Constants.BASE_URL+ "/todos/random";
    public static String RANDOM_TODOS_REQ_RESULT = Constants.BASE_URL+ "/todos/random/{req}";
    public static String LIMIT_SKIP_TODOS = Constants.BASE_URL+ "/todos?limit={limit}&skip={skip}";
    public static String ADD_NEW_TODOS = Constants.BASE_URL+ "/todos/add";
    public static String UPDATE_TODOS = Constants.BASE_URL+ "/todos/{id}";


    @Step ("Get all todos")
    public void getAllTodosByUserId(int userId) {
        SerenityRest.given().pathParam("userId",userId);
    }

    @Step ("Get all todos with spesialcharcter userId")
    public void getAllTodosWithSpecialCharacterUserId(String userId) {
        SerenityRest.given().pathParam("userId",userId);
    }

    @Step ("Get single todos")
    public void getSingleTodos(int id){
        SerenityRest.given().pathParam("id",id);
    }

    @Step ("Get Random Todos using request")
    public void getRandomreqTodos(int req){
        SerenityRest.given().pathParam("req",req);
    }

    @Step ("Get Limit & Skip Todos")
    public void  getLimitSkipTodos(int limit, int skip){
        SerenityRest.given()
                .pathParam("limit",limit)
                .pathParam("skip",skip);

    }

}
