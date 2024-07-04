package starter.Cart;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class DeletCartSteps {

    @Steps
    CartResponses cartResponses;
    @Given("Delete cart with id {int}")
    public void deleteCartWithId(int userid) {
        cartResponses.deletecart(userid);
    }

    @When("send request delete cart")
    public void sendRequestDeleteCart() {
        SerenityRest.when().delete(CartResponses.PUT_UPDATE_A_CART);
    }
}
