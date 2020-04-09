package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;



public class Google_15_GmailSearchPage extends TestBase{

	public Google_15_GmailSearchPage(){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"gs_lc50\"]/input[1]")
	public WebElement searchbox;
	
	@FindBy(xpath="//*[@id=\"gs_lc50\"]/input[1]")
	public WebElement sendEmail;
	
	public void enteronsearchBox(String name){
		searchbox.sendKeys("kvineet881@gmail.com");
		searchbox.sendKeys(Keys.ENTER);
	}
	
	@FindBy(xpath="//*[@id=\":1\"]/div/div[2]/div[4]/div[1]/div[2]/div[1]/div[1]")
	
	//@FindBy(xpath="//*[@class=\"gD\"]")
	public WebElement getactualemailid;
	
	public String getActualemailId(){
		return getactualemailid.getText();
	}
	

	
}
