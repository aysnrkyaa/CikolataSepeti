Feature:Urun Aratest
  Scenario:go to page and search product

    Given go to cikolatasepeti websiteee
    And send product name
    And click search button
    When click cicek
    Then read cicek info