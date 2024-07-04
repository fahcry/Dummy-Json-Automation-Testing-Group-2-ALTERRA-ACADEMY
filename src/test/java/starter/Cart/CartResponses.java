package starter.Cart;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Constants;

import java.io.File;

public class CartResponses {
    public static String GET_ALL_CART = Constants.BASE_URL + "/carts";
    public static String GET_A_SINGLE_CART = Constants.BASE_URL + "/carts/{carts}";
    public static String GET_CARTS_BY_A_USER = Constants.BASE_URL + "/carts/user/{carts2}";
    public static String POST_ADD_A_NEW_CART = Constants.BASE_URL + "/carts/add";
    public static String PUT_UPDATE_A_CART = Constants.BASE_URL + "/carts/{carts3}";


    @Step("Get a single cart")
    public void getAsinglecart(int carts) {
        SerenityRest.given()
                .pathParam("carts", carts);
    }
    @Step("Get a single cart string")
    public void getAsinglecartstring(String carts1) {
        SerenityRest.given()
                .pathParam("carts", carts1);
    }
    @Step("Get carts by a users")
    public void getCartsByAUser(int carts2){
        SerenityRest.given().pathParam("carts2",carts2);
    }

    @Step("Get carts by a user string")
    public void setGetCartsByAUserstring(String carts2){
        SerenityRest.given().pathParam("carts2",carts2);
    }

    @Step("Post add a new cart step")
    public void postANewCart(File json){
        SerenityRest.given().contentType(ContentType.JSON).body(json);
    }

    @Step("Put update a cart")
    public void putUpdateACart(int cart3,File json){
        SerenityRest.given()
                .pathParam("carts3",cart3).contentType(ContentType.JSON).body(json);
    }

    @Step("Delete cart")
    public void deletecart(int id){
    SerenityRest.given().pathParam("carts3", id);
    }

}
