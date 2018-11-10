Feature: I want my policy details
  As a policy holder
  I want to be able to view my policy details
  So that I can check the policy details are correct
  So that I can check I am corectly covered

  Scenario: I want to view my name
    Given policy details
    When I ask for my name
    Then I get my full name

  Scenario: I want to view my policy number
    Given policy details
    When I ask for my policy number
    Then I get my policy number

  Scenario: I want to view my age
    Given policy details
    When I ask for my age
    Then I get my age

  Scenario: I want to view my email address
    Given policy details
    When I ask for my email address
    Then I get my email address

  Scenario: I want to view all my policy details
    Given policy details
    When I ask for all my policy details
    Then I get my full name
    And I get my age
    And I get my policy number
    And I get my email address

  Scenario: I want to view all my personal details
    Given policy details
    When I ask for my personal details
    Then I get my full name
    And I get my age
    And I get my email address
    But I don't get my policy number

