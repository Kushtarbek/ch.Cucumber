@DataTables
Feature: Testing Data Tables website
  Scenario: Testing adding new employee to the table
    Given User is on the datatables homepage
    And User clicks to New Button
    Then User should see Create Entry Box
    And User should enter firstname
    And User should enter lastname
    And User should enter position
    And User should enter office
    And User should enter extension
    And User should enter start date
    And User should enter salary
    Then User should click to Create Button
    And User enters firstname to Search Box
    Then User should see first name inserted in the table

