Feature:Login Olumsuz test
  Scenario:go to page and send wrong password

    Given go to cikolatasepet website
    And click signin button
    And write usernamee
    And write wrong password
    When clickk loginn button
    Then show error message