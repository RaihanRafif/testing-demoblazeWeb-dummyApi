@web
Feature: Test Automation Web UI

  Scenario: Successful sign up
    Given user is on the home page
    And user click Sign Up button
    And user is on Sign Up page
    When user input username
    And user input password "inipassword"
    And user click Sign Up button on the sign up page
    Then user will see "Sign up successful."

  Scenario: Failed sign up
    Given user is on the home page
    And user click Sign Up button
    And user is on Sign Up page
    When user input username
    And user input password "inipassword"
    And user click Sign Up button on the sign up page
    Then user will see "Sign up successful."
    And user is on the home page
    And user click Sign Up button
    And user is on Sign Up page
    And user input username with the same last username that already been registered
    And user input password "inipassword"
    And user click Sign Up button on the sign up page
    Then user will see alert "This user already exist."

  Scenario: Successful login
    Given user is on the home page
    And user click Sign Up button
    And user is on Sign Up page
    When user input username
    And user input password "inipassword"
    And user click Sign Up button on the sign up page
    Then user will see "Sign up successful."
    And user is on the home page
    And user click Login button
    And user is on Login page
    And user input username with the same last username that already been registered (for loginPage)
    And user input password "inipassword" (for loginPage)
    And user click Login button on the sign up page
    Then user will see Welcome username

  Scenario: Failed login
    Given user is on the home page
    And user click Login button
    And user is on Login page
    When user input username that no registered before
    And user input password "inipassword" (for loginPage)
    And user click Login button on the sign up page
    Then user will see text alert "User does not exist."

  Scenario: Send message with Contact Feature
    Given user is on the home page
    And user click Contact button
    And user is on Contact page
    When user input contact email
    And user input contact name
    And user input message
    And user click send message button on the contact page
    Then user will see message "Thanks for the message!!"

  Scenario: See video on About Us page
    Given user is on the home page
    When user click About Us button
    And user is on About Us page
    Then user can see the video

  Scenario: User can add Samsung galaxy s6 to cart
    Given user is on the home page
    And user see Samsung galaxy s(six) on the Homepage
    When user click Samsung galaxy s(six) product
    And user click Add to cart
    And user will see text alert message "Product added"
    And user click Cart button
    And user is on the cart page
    Then user will see Samsung galaxy s(six) on the Cartpage

  Scenario: User can add Nokia lumia 1520 to cart
    Given user is on the home page
    And user see Nokia lumia(OneFiveTwoZero) on the Homepage
    When user click Nokia lumia(OneFiveTwoZero) product
    And user click Add to cart
    And user will see text alert message "Product added"
    And user click Cart button
    And user is on the cart page
    Then user will see Nokia lumia(OneFiveTwoZero) on the Cartpage

  Scenario: User can add  Nexus 6 to cart
    Given user is on the home page
    And user see  Nexus s(six) on the Homepage
    When user click  Nexus s(six) product
    And user click Add to cart
    And user will see text alert message "Product added"
    And user click Cart button
    And user is on the cart page
    Then user will see Nexus s(six) on the Cartpage

  Scenario: User can add Samsung galaxy s7 to cart
    Given user is on the home page
    And user see Samsung galaxy s(seven) on the Homepage
    When user click Samsung galaxy s(seven) product
    And user click Add to cart
    And user will see text alert message "Product added"
    And user click Cart button
    And user is on the cart page
    Then user will see Samsung galaxy s(seven) on the Cartpage

  Scenario: User can add Iphone 6 32gb to cart
    Given user is on the home page
    And user see Iphone (six) (ThirtyTwo) gb on the Homepage
    When user click Iphone (six) (ThirtyTwo) gb product
    And user click Add to cart
    And user will see text alert message "Product added"
    And user click Cart button
    And user is on the cart page
    Then user will see Iphone (six) (ThirtyTwo) gb on the Cartpage

  Scenario: User can add Sony xperia z5 to cart
    Given user is on the home page
    And user see Sony xperia z(five) on the Homepage
    When user click Sony xperia z(five) product
    And user click Add to cart
    And user will see text alert message "Product added"
    And user click Cart button
    And user is on the cart page
    Then user will see Sony xperia z(five) on the Cartpage

  Scenario: User can add HTC One M9 to cart
    Given user is on the home page
    And user see HTC One M(Nine) on the Homepage
    When user click HTC One M(Nine) product
    And user click Add to cart
    And user will see text alert message "Product added"
    And user click Cart button
    And user is on the cart page
    Then user will see HTC One M(Nine) on the Cartpage

  Scenario: User can add Sony vaio i5 to cart
    Given user is on the home page
    And user see Sony vaio i(Five) on the Homepage
    When user click Sony vaio i(Five) product
    And user click Add to cart
    And user will see text alert message "Product added"
    And user click Cart button
    And user is on the cart page
    Then user will see Sony vaio i(Five) on the Cartpage

  Scenario: User can add Sony vaio i7 to cart
    Given user is on the home page
    And user see Sony vaio i(Seven) on the Homepage
    When user click Sony vaio i(Seven) product
    And user click Add to cart
    And user will see text alert message "Product added"
    And user click Cart button
    And user is on the cart page
    Then user will see Sony vaio i(Seven) on the Cartpage

  Scenario: User can add Apple monitor 24 to cart
    Given user is on the home page
    And user click next button on the Homepage
    And user see Apple monitor (TwentyFour) on the Homepage
    When user click Apple monitor (TwentyFour) product
    And user click Add to cart
    And user will see text alert message "Product added"
    And user click Cart button
    And user is on the cart page
    Then user will see Apple monitor (TwentyFour) on the Cartpage

  Scenario: User can add MacBook air to cart
    Given user is on the home page
    And user click next button on the Homepage
    And user see MacBook air on the Homepage
    When user click MacBook air product
    And user click Add to cart
    And user will see text alert message "Product added"
    And user click Cart button
    And user is on the cart page
    Then user will see MacBook air on the Cartpage

  Scenario: User can add Dell i7 8gb to cart
    Given user is on the home page
    And user click next button on the Homepage
    And user see Dell i(Seven) (Eight)gb on the Homepage
    When user click Dell i(Seven) (Eight)gb product
    And user click Add to cart
    And user will see text alert message "Product added"
    And user click Cart button
    And user is on the cart page
    Then user will see Dell i(Seven) (Eight)gb on the Cartpage

  Scenario: User can add 2017 Dell 15.6 Inch to cart
    Given user is on the home page
    And user click next button on the Homepage
    And user see (Twenty Seventeen) Dell (Five point Six) gb on the Homepage
    When user click (Twenty Seventeen) Dell (Five point Six) gb product
    And user click Add to cart
    And user will see text alert message "Product added"
    And user click Cart button
    And user is on the cart page
    Then user will see (Twenty Seventeen) Dell (Five point Six) gb on the Cartpage

  Scenario: User can add ASUS Full HD to cart
    Given user is on the home page
    And user click next button on the Homepage
    And user see ASUS Full HD on the Homepage
    When user click ASUS Full HD product
    And user click Add to cart
    And user will see text alert message "Product added"
    And user click Cart button
    And user is on the cart page
    Then user will see ASUS Full HD on the Cartpage
