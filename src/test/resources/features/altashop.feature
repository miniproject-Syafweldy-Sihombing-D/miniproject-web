Feature: AltaShop

  @Login @NormalPossitve
    Scenario: User can login with correct email and correct password
      Given User is on home page
      When User click button account
      And User input a correct Email "weldy15@gmail.com"
      And User input a correct Password "weldy15"
      And User click button login
      Then User directed to home page

  @Login @NormalNegative
  Scenario: User can not login with incorrect email and correct password
    Given User is on home page
    When User click button account
    And User input a incorrect Email "salaheml"
    And User input a correct Password "weldy15"
    And User click button login

    @Logout @NormalPossitive
      Scenario: User logout from From AltaShop
      Given User is on home page
      When User click button account
      And User input a correct Email "weldy15@gmail.com"
      And User input a correct Password "weldy15"
      And User click button login
      Then User directed to home page
      And User click button account
      Then User click button logout


      @SeeDetailProduct @NormalPossitive
        Scenario: User can see detail product
        Given User is on home page
        When User click button account
        And User input a correct Email "weldy15@gmail.com"
        And User input a correct Password "weldy15"
        And User click button login
        Then User directed to home page
        And User click button detail product Surya

        @AddRatingProduct @NormalPossitive
          Scenario: User can add rating Product
          Given User is on home page
          When User click button account
          And User input a correct Email "weldy15@gmail.com"
          And User input a correct Password "weldy15"
          And User click button login
          Then User directed to home page
          And User click button detail product Surya
          Then User add star rating product

      @BuyProduct @NormalPossitive
#      Beli Product Intelligent Wool Hat
      Scenario: User can buy product AltaShop
        Given User is on home page
        When User click button account
        And User input a correct Email "weldy15@gmail.com"
        And User input a correct Password "weldy15"
        And User click button login
        Then User directed to home page
        And User click button Beli on a product
        And User click button cart
        Then User click button Bayar

        @Transaction @NormalPossitive
          Scenario: User can see transaction
          Given User is on home page
          When User click button account
          And User input a correct Email "weldy15@gmail.com"
          And User input a correct Password "weldy15"
          And User click button login
          Then User directed to home page
          When User click button account
          Then User click button Transaksi




