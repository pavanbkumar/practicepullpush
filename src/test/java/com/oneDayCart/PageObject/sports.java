package com.oneDayCart.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.GenericLib.Utility;

public class sports
{
	@FindBy(xpath="//a[.='SPORTS']")
	private WebElement sports;
	
	@FindBy(xpath="//a[.='Football']")
	private WebElement football;
	
	@FindBy(xpath="//a[.='Tennis']")
	private WebElement tennis;
	
	@FindBy(xpath="//a[.='CricketBat']")
	private WebElement CricketBat;
	
	@FindBy(xpath="//a[.='Sports Shoes']")
	private WebElement SportsShoes;
	
	@FindBy(xpath="//a[.='Basket Ball']")
	private WebElement baskBall;

	public WebElement getSports() {
		return sports;
	}

	public WebElement getFootball() {
		return football;
	}

	public WebElement getTennis() {
		return tennis;
	}

	public WebElement getCricketBat() {
		return CricketBat;
	}

	public WebElement getSportsShoes() {
		return SportsShoes;
	}

	public WebElement getBaskBall() {
		return baskBall;
	}
	
	
	public void sports()
	{
		Utility.moveToElement(Base.staticDriver, sports);
		football.click();
		Reporter.log("Clicked on football");
		Utility.moveToElement(Base.staticDriver, sports);
		baskBall.click();
		Reporter.log("clicked on the BasketBall",true);
		
		
	}
	
	

}
