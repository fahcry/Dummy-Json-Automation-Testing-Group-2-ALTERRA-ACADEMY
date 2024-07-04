package starter.Cart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matchers;

import java.util.regex.Matcher;

public class GetAllCartsSteps {

    @Steps
    CartResponses cartResponses;
    @Given("Get all carts with parameter carts")
    public void getAllCartsWithParameterCarts() {
    }
    @When("send request get all carts")
    public void sendRequestGetAllCarts() {
        SerenityRest.when().get(CartResponses.GET_ALL_CART);
    }

    @And("id soulbe be match {int}")
    public void idSoulbeBeMatch(int id) {
        SerenityRest.and().body(CartCekResponses.PRODUCT_ID,Matchers.equalTo(id));
    }

}
