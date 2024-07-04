package starter.Cart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.Matchers.equalTo;

public class ResponsesSteps {

    @Steps
    CartResponses cartResponses;

    @Then("status code should be response {int}")
    public void statusCodeShouldBeResponse(int statusCode) {
        SerenityRest.then().statusCode(statusCode);
    }


    @And("Responses body carts should be {string}")
    public void responsesBodyCartsShouldBe(String error) {
        SerenityRest.and().body(CartCekResponses.PAGE, equalTo(error));
    }
}
