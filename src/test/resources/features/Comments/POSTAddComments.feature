Feature: Add a Comment
  #Positive
  @Tugas
  Scenario: Add a comment with valid json
    Given Add a comment with valid json "postAddComment.json"
    When Send request post add comment
    Then Status code should be 201
    And Validate json schema "postAddCommentsSchema.json"
