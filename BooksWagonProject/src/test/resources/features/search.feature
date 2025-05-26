@searchFeature
Feature: Search Functionality After Login
  As a user, I want to log in and use search functionality from the homepage.
    
    Scenario: To check search functionality
    Given user is logged in and is on homepage
    When user is searching for item and searched items are shown   
    Then storing the result in excel   
  
  	Scenario: Refining the search functionality using title
  	Given user is logged in and is on homepage
    When user is searching for item and searched refined items are shown
    And user is refining the search by title
    
     #try to debug
    #Scenario: Refining the search functionality using price
  #	Given user is logged in and is on homepage
    #When user is searching for item and searched items are shown
    #And user is refining the search by price
    #
    #todo
    #Scenario: Refining the search functionality using discount
  #	Given user is logged in and is on homepage
    #When user is searching for item and searched items are shown
    #And user is refining the search by discount
    #
    Scenario: Refining the search functionality using availability
  	Given user is logged in and is on homepage
    When user is searching for item and searched refined items are shown
    And user is refining the search by availability
    
    
    #todo
    #Scenario: Refining the search functionality using shipping time
  #	Given user is logged in and is on homepage
    #When user is searching for item and searched items are shown
    #And user is refining the search by shipping time
    #
    #todo
    #Scenario: Refining the search functionality using source
  #	Given user is logged in and is on homepage
    #When user is searching for item and searched items are shown
    #And user is refining the search by source
    #
    Scenario: Refining the search functionality using binding
  	Given user is logged in and is on homepage
    When user is searching for item and searched refined items are shown
    And user is refining the search by binding
    
    Scenario: Refining the search functionality using language
  	Given user is logged in and is on homepage
    When user is searching for item and searched refined items are shown
    And user is refining the search by language
    #
    #
    #todo
    #Scenario: Refining the search functionality using publication year
  #	Given user is logged in and is on homepage
    #When user is searching for item and searched items are shown
    #And user is refining the search by publication year
    #
    #
    #
    #
    #
    #
    