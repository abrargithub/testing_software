Feature: Facebook sign up

In order to verify search
as a uger
i want to Facebook sign up

Scenario Outline:
Given user visiting facebook url
When user enter "<First name>" "<Last name>"
And valid "<email address>" and "<new password>"
Then user select dropdown Month and dropdown Day and dropdown Year

Examples:
|First name| Last name| email address |new password|
| Abrar | Khan |omago@gmail.com |abrar |