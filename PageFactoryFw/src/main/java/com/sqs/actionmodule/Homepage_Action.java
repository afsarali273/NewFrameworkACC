package com.sqs.actionmodule;

import org.openqa.selenium.WebDriver;

import com.sqs.pageobjects.Homepage_Pageobject;

public class Homepage_Action {
	
	Homepage_Pageobject home;
	public Homepage_Action(WebDriver driver){
		
		home=new Homepage_Pageobject(driver);
	}
	
	
	
	public void Login(String EnterUsername,String EnterPW){
		home.Enter_userName(EnterUsername);
		home.Enter_Password(EnterPW);
		home.Click_button_SignIn();
	}
	
	
	
	

}
