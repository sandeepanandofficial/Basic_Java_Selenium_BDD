#Author - Sandeep Anand

Feature: Login To Application

Scenario: Login to Vtiger Application valid with valid Credentials
Given I want to launch the browser
And enter the URL
When the Login Page is displayed enter credentials
And Click on login button
Then validate for Home Page