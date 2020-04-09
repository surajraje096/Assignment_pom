package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;



public class Google_12_ReadEmailPage extends TestBase{

	public Google_12_ReadEmailPage(){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[1]/div/div[1]/div[2]/div[1]/span/div[1]/span/span[2]")
	public WebElement totalemails;
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div[1]/div/div[1]/div/div/div[2]/div")
	public WebElement indexemails;
	
	
	public int getreademails(){
		String str1 = totalemails.getText();
		String str2 = indexemails.getText();
		
		int no1 = Integer.valueOf(str1);
		int no2 = Integer.valueOf(str2);
		
		return no1-no2;
		
	}
	
}
