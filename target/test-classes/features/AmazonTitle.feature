@amazon
Feature:Amazon Title verification

  Scenario: Verifying the title amazon.com
    When user goes to amazon.com
    Then user should see Amazon.com: Online Shopping
    And user should be able to click on DropDown

    Scenario: Amazon URL verification
      When user goes to amazon.com
      Then user should validate url

