package com.sqs.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_PageObject {
	
	public Registration_PageObject(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="firstName")
	private WebElement input_firstName;
	
	@FindBy(name="lastName")
	private WebElement input_lastName;
	
	@FindBy(name="phone")
	private WebElement input_phone;
	
	@FindBy(id="userName")
	private WebElement input_email;
	
	/**@author Afsar
	 * @Date 5/27/2018
	 * {@code This method will be used for entring the fname of the user}
	 * @param EnterfirstName
	 * return void-->
	 */
	
	public void Enter_input_firstName(String EnterfirstName){
		input_firstName.sendKeys(EnterfirstName);
		System.out.println("first name is entered as : "+EnterfirstName);
	}
	

	public void Enter_input_lastName(String Enterlastname){
		input_lastName.sendKeys(Enterlastname);
		System.out.println("last name is entered as : "+Enterlastname);
	}
	

	public void Enter_input_phone(String Enterphone){
		input_phone.sendKeys(Enterphone);
		System.out.println("phone number is entered as : "+Enterphone);
	}
	

	public void Enter_input_email(String EnterEmail){
		input_email.sendKeys(EnterEmail);
		System.out.println("Email is entered as : "+EnterEmail);
	}
	
	

}
