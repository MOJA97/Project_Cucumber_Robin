Feature: Adactin hotel

Scenario: login functionality

Given user can be able to launch the url
When  user can be able to enter the username in textbox
And   user can be able to enter the password in textbox
Then  user can be able to click on the login button and the page should navigates to the search hotel page

Scenario: Search Hotel Functionality

When user can be able to choose the dropdown for location
And  user can be able to select the hotel dropdown
And  user can be able to choose the room type dropdown
And  user should be able to pick the number of room dropdown
And  user can be able to clear the Check_in_Date textbox and enter the check-in-date textbox
And  user should clear the check-ou-date textbox and enter the check-out-date textbox
And  user can be able to select the dropdown for adults per room
And  user can be able to select the children per room dropdown
Then user can be able to click on the search button and the page should navigates to the select hotel page

Scenario: Select Hotel Functionality

When user can be able to click the radio button for booking the hotel
Then user can be able to click the continue button and the page should navigates to book hotel page

Scenario: Book Hotel Functionality

When user should be able to enter the first name in the First name textbox
And  user should enter the last name in the last name textbox
And  user should be able to enter the Address in the Billing address textbox
And  user can be able to enter the 16 digit credit card number in the credit card number textbox
And  user can be able to select the Credit card type dropdown
And  user can be able to select the expiry month in the Expiry date dropdown
And  user can be able to choose the expiry year of the credit card in the expiry date dropdown
And  user can be able to enter the 3 digit CVV number of the credit card inside the CVV number textbox
Then user can be able to click on the book now button and the page will confirm the booking

Scenario: Logout Functionality

When user can be able to click the logout button
Then user will be able to navigates int logout page