package starter.Cart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.utils.Constants;

import java.io.File;

public class PutUpdateACartSteps {
    @Steps
    CartResponses cartResponses;

    @When("send request put update a cart")
    public void sendRequestPutUpdateACart() {
        SerenityRest.when().put(CartResponses.PUT_UPDATE_A_CART);
    }

    @Given("update a cart with valid parameter id {int} json {string}")
    public void updateACartWithValidParameterIdJson(int carts, String jsofile) {
        File filejson = new File(Constants.REQ_BODY+jsofile);
        cartResponses.putUpdateACart(carts,filejson);
    }

    @And("validate json schema {string}")
    public void validateJsonSchema(String jsonschema) {
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(jsonschema));
    }
}
