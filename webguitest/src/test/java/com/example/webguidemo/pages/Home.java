package com.example.webguidemo.pages;

import java.util.concurrent.TimeUnit;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;

public class Home extends WebDriverPage {

	public Home(WebDriverProvider driverProvider) {
		super(driverProvider);
	}

	private final static String LOGIN_LINK_TEXT = "mlogin";


	
	public void open() {
		manage().window().maximize();
		get("http://demotywatory.pl/");
		manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	public void click(String ElementName){
		findElement(By.linkText(ElementName)).click();
	}
	
	public void clickID(String ElementName){
		findElement(By.id(ElementName)).click();
	}
	
	public void clickLoginLink(){
		clickID(LOGIN_LINK_TEXT);
	}
	
}
