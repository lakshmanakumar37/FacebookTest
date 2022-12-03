Feature: facebook login test
  Scenario: fb positive test
    Given lunch the browser
    And maximize the browser
    When facebook URL lunch
    And enter user name
    And enter password
    Then click the login button
