package com.sqs.actionmodule;

import org.openqa.selenium.WebDriver;

import com.sqs.pageobjects.Registration_PageObject;

public class Registration_Action {
	
	Registration_PageObject reg;
	public Registration_Action(WebDriver driver){
	
		reg=new Registration_PageObject(driver);
	}
	
	
	public void registration(String EnterfirstName,String Enterlastname,String Enterphone,String EnterEmail){
		
		reg.Enter_input_firstName(EnterfirstName);
		reg.Enter_input_lastName(Enterlastname);
		reg.Enter_input_phone(Enterphone);
		reg.Enter_input_email(EnterEmail);
		
	}
	
	

}
