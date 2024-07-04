Feature: Get Limit and Skip Comments
  #Positive
  @Tugas
  Scenario Outline: Get limit and skip comments with valid parameter
    Given Get limit and skip comments with valid parameter limit <limit> and skip <skip>
    When Send request get skip comments
    Then Status code should be 200
    And Validate json schema "getLimitAndSkipCommentsSchema.json"
    Examples:
      | limit | skip |
      | 10    | 10   |
      | 5     | 5    |