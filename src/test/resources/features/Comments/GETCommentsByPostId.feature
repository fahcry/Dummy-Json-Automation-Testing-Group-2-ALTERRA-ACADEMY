Feature: Get Comment by PostId
  # Positive
  @Tugas
  Scenario: Get Comment by PostId
    Given Get all comments by PostId 6
    When send request to get Comment by PostId
    Then Status code should be 200
    And  Validate json schema "getAllCommentsByPostIdSchema.json"

  Scenario Outline: Get Invalid Comment by PostId
    Given Get all comments by PostId <id>
    When send request to get Comment by PostId
    Then Status code should be 404
    Examples:
      | id  |
      | 341 |
      | 500 |