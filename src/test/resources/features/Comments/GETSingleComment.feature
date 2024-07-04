Feature: Get Single Comments
  #Positive
  @Tugas
  Scenario: Get single comments with valid parameter
    Given Get single comment with valid id 1
    When Send request to get single comment
    Then Status code should be 200
    And  Validate json schema "getSingleCommentSchema.json"
