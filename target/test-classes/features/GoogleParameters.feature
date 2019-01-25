@googleParameters

Feature: Google search functionality
  Scenario: Testing google search
    Given User is on google homepage
    When User enters "phones"
    Then User should see "phones" in the title