
Feature: Google search functionality
  Agile Story: As a user, when I am on the google
  search page, I should be able to search whatever
  I want, and see relevant information

  @-013
  Scenario: Search page title verification
    Given User is on Google home page
    Then User should see title is Google

  @-014
  Scenario: User search title verification
    Given User is on Google home page
    When User searches for apple
    Then User should see apple in the title

  @-015
  Scenario: User search title verification
    Given User is on Google home page
    When User searches for "orange"
    Then User should see "orange - Google Search" in the title

  @-016
  Scenario: Google home page footer links verification
    Given User is on Google home page
    Then User should see following links
      | Advertising               |
      | Business                  |
      | How Search works          |
      | Carbon neutral since 2007 |
      | Privacy                   |
      | Terms                     |