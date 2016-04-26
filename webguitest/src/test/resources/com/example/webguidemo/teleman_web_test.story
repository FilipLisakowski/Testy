Scenario: User searches for a single step
 
Given user is on Home page
When user opens Log In link
Then Log In page is shown

When user log in with invalid arguments
Then Error is shown

When user log in with good arguments
Then Welcome text is shown

When user comment a demot
Then Comment is shown

When user log out
Then user is logged out