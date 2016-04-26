package com.example.webguidemo.pages;

import java.util.concurrent.TimeUnit;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;

public class Login extends WebDriverPage{
	
	public Login(WebDriverProvider driverProvider) {
		super(driverProvider);		
	}

	public void open() {
		get("http://demotywatory.pl/login");
		manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public String loginPageIsShown() {
		return findElement(By.xpath("//div[contains(@id, 'main_container')]/h2")).getText();
	}
	
	public String messageCheck() {
		return findElement(By.id("messages")).getText();
	}
	
	
	public void logInCorrect(){
		findElement(By.xpath("(//input[@name='username'])[3]")).clear();
		findElement(By.xpath("(//input[@name='username'])[3]")).sendKeys("s10690");
		findElement(By.xpath("(//input[@name='password'])[3]")).clear();
		findElement(By.xpath("(//input[@name='password'])[3]")).sendKeys("Testujemy123");
		findElement(By.xpath("(//input[@value='Zaloguj'])[2]")).click();
	}

	public void logInInvalid(){
		findElement(By.xpath("(//input[@name='username'])[3]")).clear();
		findElement(By.xpath("(//input[@name='username'])[3]")).sendKeys("s10690");
		findElement(By.xpath("(//input[@name='password'])[3]")).clear();
		findElement(By.xpath("(//input[@name='password'])[3]")).sendKeys("Teadawd");
		findElement(By.xpath("(//input[@value='Zaloguj'])[2]")).click();
	}
	
	public void comment(){
		findElement(By.linkText("Losuj")).click();
		findElement(By.id("comment")).clear();
		findElement(By.id("comment")).sendKeys(":)");
		findElement(By.cssSelector("input.js-add_comment_button")).click();
	}
	
	public String commIsShown(){
		return findElement(By.linkText("s10690")).getText();
	}
	
	public void logout(){
		findElement(By.cssSelector("#mavatar > span")).click();
		findElement(By.linkText("Wyloguj")).click();
	}

	
}
