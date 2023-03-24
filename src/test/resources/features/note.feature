
Feature: Note module functionality
  User Story:
  As a user, I should be able to create/delete any note and see the details of the note.


  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user go to login page
    When user fill out username and password field
    And user clicks login button from button of the placeholder field
    Then user should be able to home page successfully

  @MEETS10-346 @wip
    Scenario: Create a new note
      When user clicks on the pen shaped notes icon
      And user clicks on the New Note button
      And user writes anything inside the new code
      And user clicks enter
      And the user should be able to see the first words of the new note as the title in the placeholder of the new note
  @MEETS10-347 @wip
    Scenario: Add note to favorites
  When user clicks on the pen shaped notes icon
      When user clicks three dot icon
      When user clicks on the Add to favorites option button
      And user clicks on the File icon
      Then user should see All File page
      When user clicks on the Favorites option button
      Then user should see the file that newly added to favorites list under Favorites inside the Files

 @MEETS10-348 @wip
      Scenario: View note details
        When user clicks on the pen shaped notes icon
        When user clicks on the three dots on the right of the page
        And user clicks on the details
        Then Verify that the note details are displayed, including the number of letters and words in the note
  @MEETS10-349 @wip
        Scenario: Create a new category
          When user clicks on the pen shaped notes icon
    When user clicks on the three dots on the right of the page
    And user clicks on the details
          When user clicks on the Uncategorized placeholder
          And user writes new category name
          And user clicks on the arrow icon
          And user clicks on the Categories file
          Then verify that new category appears
 @MEETS10-350 @wip
          Scenario: Delete a note
            When user clicks on the pen shaped notes icon
            When user clicks on the three dots icon
            And user clicks on the delete note button
            Then Verify that the note is no longer displayed on the main screen.








