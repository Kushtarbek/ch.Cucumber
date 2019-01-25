@youtubeS
Feature: Youtube Search

  Scenario: Testing youtube search
    Given User is on the youtube homepage
    And User is able to see the search box
    And User is able to see the search button
    When user searches for Funny Cat Videos
    Then User shold see results related to funny cats