@wip
Feature: Note module functionality
  User Story:
  As a user, I should be able to create/delete any note and see the details of the note.


  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user go to login page
    When user fill out username and password field
    And user clicks login button from button of the placeholder field
    Then user should be able to home page successfully

    Scenario: User should be able to create a new note
      When user clicks on the pen shaped notes icon
      And user clicks on the New Note button
      And user writes anything inside the new code
      And user clicks enter
      Then the user should be able to see the first words of the new note as the title in the placeholder of the new note



