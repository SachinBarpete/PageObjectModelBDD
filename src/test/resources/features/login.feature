Feature: Login to Spotify

  Scenario: Login to Spotify application
    Given launch url "https://open.spotify.com/"
    When click on Log in button
    And  Enter email "email" and password "password"
    Then verify login page title "Login - Spotify"
    Then login and redirect to homepage