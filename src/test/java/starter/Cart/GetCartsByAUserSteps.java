package starter.Cart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matchers;

public class GetCartsByAUserSteps {

    @Steps
    CartResponses cartResponses;

    @Given("get a carts by a user with parameter {int}")
    public void getACartsByAUserWithParameter(int carts2) {
        cartResponses.getCartsByAUser(carts2);
    }
    @When("send request get carts by a user")
    public void sendRequestGetCartsByAUser() {
        SerenityRest.when().get(CartResponses.GET_CARTS_BY_A_USER);
    }


    @Given("get a carts by a user with parameter {string}")
    public void getACartsByAUserWithParameter(String carts2) {
        cartResponses.setGetCartsByAUserstring(carts2);
    }

}
