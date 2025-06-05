Feature: Radio button interaction

  Scenario: Select Yes radio button
    When Going To Page "https://demoqa.com/radio-button"
    And Wait And Select Radio Button Yes
    Then Verify Radio Button Yes Selected
