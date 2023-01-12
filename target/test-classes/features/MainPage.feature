
Feature: Regular testing of home Page
  Background:
      Given User opens the given link
      Then User verify the Dashboard is opened

  Scenario: Default forms page
    Given the user is on the forms page
    Then User verify the Forms page is opened
