package com.testCase;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.pageObject.Validations;
import com.resourses.base;

public class TestCase extends base 
{
	public WebDriver driver;
	private int countOfAllValues =5;
	private String totalBalance="$1,000,000.00";
	Validations val= new Validations(driver);
	
	public void ValidateCount()
	{
		int expectedCount=val.rightCount().size();
		int actualCount = countOfAllValues;
		Assert.assertEquals(expectedCount, actualCount);
	}
	
	public void validateTotalBalance()
	{
		String expectedTotal = val.totalBalance();
		String actualTotal = totalBalance;
		Assert.assertEquals(expectedTotal, actualTotal);
	}
	
	public void validateCurrencies()
	{
		List<WebElement> values = val.rightCount();
		for(int i=0;i<=values.size();i++)
		{
			if(values.size()>0 && values.contains("$"))
			{
				Assert.assertTrue(true);
			}
		}
	}
	
	public void validateSumValues()
	{
		int integerValue=0;
		int sumValue=0;
		List<WebElement> values = val.rightCount();
		
		for(WebElement w:values)
		{
			String tableValue=w.getText();
			integerValue=Integer.parseInt(tableValue);
			sumValue=sumValue+integerValue;
		}
		System.out.println("Total Sum:"+ sumValue);
		
		Assert.assertEquals(totalBalance, sumValue);
		
	}

}
