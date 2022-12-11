@Test
Feature: User testing shop cart functionality
  Validate item name, price and User name


  Scenario: Home page functionality
    Given User opens base url and close cookies
    When User mouse over Computer components category and selects HDD and SSD disk category
    And User selects desired category
    And User sorts items by lower price
    And User selects desired product
    Then User validate item name and price
    When User enters "konre93@gmail.com"
    Then User select delivery, fill "Konstantins", "Resetnikovs", "22084178" and validate name and price




