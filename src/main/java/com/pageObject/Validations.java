package com.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validations 
{
	public WebDriver driver;
	public Validations(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By countOfValues=By.xpath("//*[contains(@id,'txt_val')]");
	By totalValue= By.xpath("//*[@id='txt_ttl_val']");
	
	public List<WebElement> rightCount()
	{
		return driver.findElements(countOfValues);
	}
	
	public String totalBalance()
	{
		return driver.findElement(totalValue).getText();
	}

}
