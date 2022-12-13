@CartTest
Feature: User testing shop cart functionality
  Validate item name, price and User name


  Scenario: Home page functionality
    Given I open base url and close cookies
    And I mouse over Computer components category and selects HDD and SSD disk category
    And I select desired category
    And I sort items by lower price
    And I select desired product
    And I validate item name and price
    When I enter "konre93@gmail.com"
    And I select delivery
    Then Fill "Konstantins", "Resetnikovs", "22084178" and Validate name and price





