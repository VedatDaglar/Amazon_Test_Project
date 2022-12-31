Feature: user should be able to search items and add to basket

  @tc1
  Scenario Outline: Verify that user search the items without login
    When user navigates to amazon homepage
    And user writes "<item name>" into the search box and press enter
    Then user should be able to see "<item name>" on the results

    Examples: items
      | item name               |
      | Iphone 15 pro 1tb       |
      | PlayStation PS5 Console |
      | AirPods Pro             |

