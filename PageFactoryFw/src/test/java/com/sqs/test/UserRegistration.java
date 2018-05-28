package com.sqs.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.sqs.actionmodule.Homepage_Action;
import com.sqs.actionmodule.Registration_Action;

public class UserRegistration {
	
	WebDriver driver;
	Homepage_Action hm=new Homepage_Action(driver);
	Registration_Action reg=new Registration_Action(driver);
	
	@Test
	public void RegistrationFlow(){
		hm.Login("mercury", "mercury");
		reg.registration("Prudhvi", "Champathi", "8097455609", "email@gmail.com");
	}

}
