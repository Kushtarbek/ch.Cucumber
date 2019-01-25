@google
Feature: Google Search

  Scenario: Making sure that google search is working as expected

    Given User in on the google homepage
    And User enters flowers
    And USer clicks search button
    Then User shoul see results related to flowers