Feature: Login
  As a user, I want to be able to access  with username and password

 #Background: Truck driver is on the vyTrack login page


  @test
  Scenario: Login  with correct credentials and verify by the name
    Given User is on the login page
    When User enters credential
    Then User name should be displayed
