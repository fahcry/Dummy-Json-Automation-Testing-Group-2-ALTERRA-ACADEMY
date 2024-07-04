package starter.Cart;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.utils.Constants;

import java.io.File;

public class PostAddANewCartSteps {
    @Steps
    CartResponses cartResponses;
    @Given("Create Add a new cart with file json {string}")
    public void createAddANewCartWithFileJson(String filename) {
        File fileJson = new File(Constants.REQ_BODY + filename);
        cartResponses.postANewCart(fileJson);
    }

    @When("send request post add a new cart")
    public void sendRequestPostAddANewCart() {
        SerenityRest.when().post(CartResponses.POST_ADD_A_NEW_CART);
    }

}
