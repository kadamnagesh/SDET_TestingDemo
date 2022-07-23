Feature: Application login

Background:
Given validate the browser
When Browser is triggered
Then Check if browser is started


@RegTest @SmokeTest
Scenario: Home page default login
Given User is on net banking landing page
When User login into application with use "john" and pass "1234"
Then Home page papulated
And card displyed are "true"

@SmokeTest
Scenario: Home page default login
Given User is on net banking landing page
When User login into application with use "gayle" and pass "4321"
Then Home page papulated
And card displyed are "false"

@RegTest
Scenario: Home page default login
Given User is on net banking landing page
When User sign up with following details
| jenny | abcd | john@gmail.com | Australia | 123456 |
Then Home page papulated
And card displyed are "false"

@SmokeTest
Scenario Outline: Home page default login
Given User is on net banking landing page
When User login in to application with use <Username> and pass <Password>
Then Home page papulated
And card displyed are "false"

Examples:
| Username| Password |
|user1   |pass1    |
|user2   |pass2    |
|user3   |pass3    |
|user4   |pass4    |
