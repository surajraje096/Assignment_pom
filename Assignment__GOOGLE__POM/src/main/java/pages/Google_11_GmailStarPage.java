package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;



public class Google_11_GmailStarPage extends TestBase{

	public Google_11_GmailStarPage(){
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//*[@id=\":kk\"]/div/div[2]/span/a")
	public WebElement starredbutton;
	
	public void clickonStarredbutton(){
		starredbutton.click();
	}
	
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[1]/div/div[1]/div[2]/div[1]/span/div[1]/span/span[2]")
	public WebElement totalemail;
	
	public String getTotalstarredemail(){
		return totalemail.getText();
	}
	
	public int gettotalStarredemail(){
		List<WebElement> list = driver.findElements(By.xpath("//span[@title='Starred']"));
		return list.size();
	}
}
