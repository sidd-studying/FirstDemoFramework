Feature: Studying java


  @FirstTests
  Scenario Outline: Cucumber Demo file testing parallel execution
    Given I enter my user name and password "<userName>"
    When I click on the login button
    Then I see the landing page

    Examples:
      | userName  |
      | Siddharth |

  @FirstTests
  Scenario Outline: Cucumber Demo file testing second test for parallel execution
    Given I enter my user name and password "<userName>"
    When I click on the login button
    Then I see the landing page

    Examples:
      | userName  |
      | Siddharth |


  @FirstTests
  Scenario Outline: Cucumber Demo file 0
    Given I enter my user name and password "<userName>"
    When I click on the login button
    Then I see the landing page

    Examples:
      | userName  |
      | Siddharth |


  @FirstTests
  Scenario Outline: Cucumber Demo file 1
    Given I enter my user name and password "<userName>"
    When I click on the login button
    Then I see the landing page

    Examples:
      | userName  |
      | Siddharth |


  @Sanity
  Scenario Outline: Cucumber Demo file 1
    Given I enter my user name and password "<userName>"
    When I click on the login button
    Then I see the landing page

    Examples:
      | userName  |
      | Siddharth |

  @Smoke
  Scenario Outline: Cucumber Demo file 2
    Given I enter my user name and password "<userName>"
    When I click on the login button
    Then I see the landing page

    Examples:
      | userName  |
      | Siddharth |