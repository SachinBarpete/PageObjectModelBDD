Feature: Home page features

  Scenario: Search a track
    Given launch url "https://open.spotify.com/" and login using email "barpetesachin@gmail.com" and password "admin@2020"
    When click on search
    And search a track "closure"
    Then verify the title "Spotify – Search"
    Then verify currentURL "https://open.spotify.com/search/closure"
    Then close driver