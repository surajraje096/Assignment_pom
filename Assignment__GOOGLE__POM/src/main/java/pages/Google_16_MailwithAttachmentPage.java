package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;



public class Google_16_MailwithAttachmentPage extends TestBase{

	public Google_16_MailwithAttachmentPage(){
		PageFactory.initElements(driver,this);
	}
	
	public int getattachmentemailsno(){
		List<WebElement> list = driver.findElements(By.xpath("//span[text()=\"Attachment\"]"));
		return list.size();
	}
}
