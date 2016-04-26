package com.example.webguidemo;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;

import static org.junit.Assert.*;

public class PagesSteps {
	
	private final Pages pages;
/*
	Scenario: User searches for a single step
	 
	Given user is on Home page
	When user opens Log In link
	Then Log In page is shown
	When user log in with invalid arguments
	Then Error is shown
	When user log in with good arguments
	Then Welcome text is shown
	When user comment a demot
	Then Comment is shown
	When user log out
	Then user is logged out
*/
	
	public PagesSteps(Pages pages) {
		this.pages = pages;
	}
	
	@Given("user is on Home page")
    public void userIsOnHomePage(){        
        pages.home().open();
        assertEquals("Demotywatory.pl", pages.home().getTitle());
    }
 
    @When("user opens Log In link")
    public void userClicksOnLoginLink(){        
        pages.home().clickLoginLink();
    }
 
    @Then("Log In page is shown")
    public void demotyLoginPageIsShown(){
       assertEquals("Logowanie", pages.login().loginPageIsShown());
    }	
    
    @When("user log in with invalid arguments")
    public void userLoginInvalid(){
    	pages.login().logInInvalid();
    }
    
    @Then("Error is shown")
    public void errorIsShown(){
       assertEquals("Logowanie nie powiodło się. Sprawdź ponownie wpisywane hasło.", pages.login().messageCheck());
    }	
    
    @When("user log in with good arguments")
    public void userLoginCorrect(){
    	pages.login().logInCorrect();
    }
    
    @Then("Welcome text is shown")
    public void welcomeIsShown(){
       assertEquals("Witaj w serwisie, s10690", pages.login().messageCheck());
    }
    
    @When("user comment a demot")
    public void commentDemot(){
    	pages.login().comment();
    }
    
    @Then("Comment is shown")
    public void commentIsShown(){
       assertEquals("s10690", pages.login().commIsShown());
    }	
    
    @When("user log out")
    public void userLogOut(){
    	pages.login().logout();
    }	
    
    @Then("user is logged out")
    public void userLogOutCheck(){
        assertEquals("Wylogowano. Zapraszamy kiedyś ponownie.", pages.login().messageCheck());
    }	
    

}
