@tag
Feature: Verify the Response codes

  @Success
  Scenario: Validate the response code for GET is 200
   Given we have the url
   When we do GET
   Then vaidate the response code is 200