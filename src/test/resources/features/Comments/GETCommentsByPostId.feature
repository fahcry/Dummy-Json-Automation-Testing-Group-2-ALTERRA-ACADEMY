Feature: Get Comment by PostId
  # Positive
  @Tugas
  Scenario: Get Comment by PostId
    Given Get all comments by PostId 5
    When send request to get Comment by PostId
    Then Status code should be 200
    And  Validate json schema "getAllCommentsByPostIdSchema.json"
