Feature:AltaShop

  @Register
    Scenario: User Register with correct Nama Lengkap, Email, and Password
      Given User is on AltaShop register Page
      When User input correct Nama Lengkap "welduy"
      And User input correct Email "weldy15@gmail.com"
      And User input correct Password "weldy15"
      Then User click register button



#      Then User directed to login page

#  @Login @NormalPositive @Coba
#  Scenario: User can login with correct email and password
#    Given user is on login page
#    And user input correct email
#    And user input correct password
#    And user click login

#  @Login @NormalNegative
#  Scenario: User cannot login with incorrect email and incorrect password
#    Given user is on login page
#    And user input incorrect email
#    And user input incorrect password
#    And user click login
#    Then user cannot login and still on login page
#
#  @Login @NormalNegative
#  Scenario: User cannot login with correct email and incorrect password
#    Given user is on login page
#    And user input correct email
#    And user input incorrect password
#    And user click login
#    Then user cannot login and still on login page
#
#  @Login @NormalNegative
#  Scenario: User cannot login with incorrect email and correct password
#    Given user is on login page
#    And user input incorrect email
#    And user input correct password
#    And user click login
#    Then user cannot login and still on login page
#
#  @Login @NormalNegative
#  Scenario: User cannot login with blank email and correct password
#    Given user is on login page
#    And user input blank email
#    And user input correct password
#    And user click login
#    Then user cannot login and still on login page
#
#  @Login @NormalNegative
#  Scenario: User cannot login with correct email and blank password
#    Given user is on login page
#    And user input correct email
#    And user input blank password
#    And user click login
#    Then user cannot login and still on login page
#
#  @Login @NormalNegative
#  Scenario: User cannot login with blank email and blank password
#    Given user is on login page
#    And user input blank email
#    And user input blank password
#    And user click login
#    Then user cannot login and still on login page

