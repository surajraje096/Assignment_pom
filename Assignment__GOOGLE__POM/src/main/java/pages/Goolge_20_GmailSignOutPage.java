package pages;

import org.openqa.selenium.support.PageFactory;

import base.TestBase;


public class Goolge_20_GmailSignOutPage extends TestBase{

	public Goolge_20_GmailSignOutPage(){
		PageFactory.initElements(driver,this);
	}
	
	public String getTitle(){
		return driver.getTitle();
	}
}
