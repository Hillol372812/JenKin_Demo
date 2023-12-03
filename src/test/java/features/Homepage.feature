Feature: Homepage Testing

  @SmokeTest @prod
  Scenario: Homepage validation
    Given User initialize the browser
    When user in HomePage Page
    And Navigate to MobilesPage and click on link
    And Navigate to ShopByBrand page and click
    When User navigate to ShopByBrandNokiaLink page and select the color
    Then Title of the page is "true"
