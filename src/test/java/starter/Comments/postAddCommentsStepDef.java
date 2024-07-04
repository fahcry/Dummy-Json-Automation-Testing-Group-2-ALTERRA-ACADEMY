package starter.Comments;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.utils.Constants;

import java.io.File;

public class postAddCommentsStepDef {

    @Steps
    CommentsAPI commentsAPI;
    @Given("Add a comment with valid json {string}")
    public void addACommentWithValidJson(String json) {
        File jsonFile = new File(Constants.REQ_BODY + json);
        commentsAPI.postAddComment(jsonFile);
    }

    @When("Send request post add comment")
    public void sendRequestPostAddComment() {
        SerenityRest.when().post(CommentsAPI.POST_ADD_COMMENT);
    }

    // Negative
    @Given("Add a comment with invalid json {string}")
    public void addACommentWithinValidJson(String json) {
        File jsonFIle = new File(Constants.REQ_BODY + json);
    }

}
