Feature: Reset functionality on login page of Application 


Scenario: Verification of Reset button 


Given Open the Firefox and launch the application			

When click on item with selector "#navbar-brand-centered > ul > li:nth-child(1) > a"

Then div vivible and clickable with xpath "//*[@id='navbar-brand-centered']/ul/li[1]/ul/li[9]/a" 

Then click on item with xpath "//*[@id='navbar-brand-centered']/ul/li[1]/ul/li[9]/a"

Then go back to previous URL

Then Enter the Username and Password			

Then Reset the credential		