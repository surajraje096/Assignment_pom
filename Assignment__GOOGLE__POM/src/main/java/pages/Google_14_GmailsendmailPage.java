package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import config.XPath;

public class Google_14_GmailsendmailPage extends TestBase {

	public Google_14_GmailsendmailPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\":r1\"]")
	public WebElement to;
	
	@FindBy(xpath = "//*[@id=\":qj\"]")
	public WebElement subject;
	
	@FindBy(xpath = "//*[@id=\":q9\"]")
	public WebElement sendbttan;
	
	public void sendmailTo() throws InterruptedException {

		Thread.sleep(3000);
		to.sendKeys(XPath.to);
		
	}
	public void sendmailsubject() throws InterruptedException {

		Thread.sleep(3000);
		subject.sendKeys(XPath.subject);
		
	}
	public void sendmailsendbttan() throws InterruptedException {

		Thread.sleep(3000);
		sendbttan.click();
		
	}

	
	
	
	
	
	
}
