Feature: Login to the OrangeHRM

  Scenario: Login to the OrangeHRM with valid credentials
    Given navigate to the OrangeHRM 
    And enter <Username> and <Password>
    Then click login button


    Examples: 
      | Username | Password | 
      | Admin | admin123 | 