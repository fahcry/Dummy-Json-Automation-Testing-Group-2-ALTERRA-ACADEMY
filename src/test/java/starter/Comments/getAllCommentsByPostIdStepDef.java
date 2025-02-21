package starter.Comments;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class getAllCommentsByPostIdStepDef {
    @Steps
    CommentsAPI commentsAPI;

    @Given("Get all comments by PostId {int}")
    public void getAllCommentByPostId(int id) {
        commentsAPI.getAllCommentsByPostId(id);
    }

    @When("send request to get Comment by PostId")
    public void sendRequestToGetCommentByPostId() {
        SerenityRest.when()
                .get(CommentsAPI.GET_All_COMMENTS_POSTID);
    }

}
