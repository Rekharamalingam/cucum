Feature: Search application
Scenario Outline: validation

When browser
Given type"<prod>"
When click
When proceed payment



Examples:
|prod|
|headphone|