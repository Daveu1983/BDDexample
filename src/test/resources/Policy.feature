Feature: I want my policy details
  As a policy holder
  I want to be able to view my policy details
  So that I can check the policy details are correct
  So that I can check I am corectly covered

  Scenario: I want to view my name
    Given policy details
    When I ask for my name
    Then I get my full name

