@amazons
Feature: Amazon search

  @Background: User is on the amazon homepage

  Scenario: Amazon search test
    //Given User is on the amazon homepage
    When User enters headphones keyword
    And User clicks to amazon search button
    Then User shold see results related

  Scenario: Amazon search test2
    Given User is on the amazon homepage
    When User enters headphones keyword
    And User clicks to amazon search button
    Then User shold see results related

  Scenario: Amazon search test3
    Given User is on the amazon homepage
    When User enters headphones keyword
    And User clicks to amazon search button
    Then User shold see results related

