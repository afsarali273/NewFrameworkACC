package com.sqs.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Homepage_Pageobject {

	
	public Homepage_Pageobject(WebDriver driver){
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID_OR_NAME , using="userName")
	private WebElement input_username;

	@FindBy(how=How.ID_OR_NAME , using="password")
	private WebElement input_password;

	@FindBy(how=How.ID_OR_NAME , using="login")
	private WebElement button_SignIn;

	@FindBy(how=How.LINK_TEXT , using="REGISTER")
	private WebElement link_Register;

	@FindBy(how=How.LINK_TEXT , using="SIGN-OFF")
	private WebElement link_SignOff;


	public void Enter_userName(String EnterUsername){

		input_username.sendKeys(EnterUsername);

		System.out.println("username is Entered as : "+EnterUsername);
	}



	public void Enter_Password(String EnterPW){

		input_password.sendKeys(EnterPW);

		System.out.println("password is Entered as : "+EnterPW);
	}

	public void Click_button_SignIn(){

		button_SignIn.click();

		System.out.println("Sign in Button is clicked");
	}

	public void Click_link_Register(){

		link_Register.click();
		System.out.println("link_Register  is clicked");
	}

	public void Click_link_SignOff(){

		link_SignOff.click();
		System.out.println("link_SignOff  is clicked");
	}




}
