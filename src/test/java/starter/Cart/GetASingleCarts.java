package starter.Cart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;


public class GetASingleCarts {
    @Steps
    CartResponses cartResponses;

    @Given("get a single carts with parameter {int}")
    public void getASingleCartsWithParameter(int carts) {
        cartResponses.getAsinglecart(carts);
    }

    @When("send request get a single carts")
    public void sendRequestGetASingleCarts() {
        SerenityRest.when().get(CartResponses.GET_A_SINGLE_CART);
    }

    @Given("get a single carts with parameter {string}")
    public void getASingleCartsWithParameter(String carts1) {
        cartResponses.getAsinglecartstring(carts1);

    }
    @And("id soulbe be match {int}")
    public void idSoulbeBeMatch(int id) {
    SerenityRest.and().body(CartCekResponses.ID, Matchers.equalTo(id));
    }
}
