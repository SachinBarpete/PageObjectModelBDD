Feature: Login to Spotify

  Scenario: Login to Spotify application
    Given launch url "https://open.spotify.com/"
    When click on Log in button
    And  Enter email "barpetesachin@gmail.com" and password "admin@2020"
    Then verify login page title "Login - Spotify"
    Then login and redirect to homepage