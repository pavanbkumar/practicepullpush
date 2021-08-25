package com.oneDayCart.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.GenericLib.Utility;

public class fishMeat 
{
	@FindBy(xpath="//a[.='FISH & MEAT']")
	private WebElement fishmeat;
	@FindBy(xpath="//a[.='FRESH MEAT']")
	private WebElement freshmeat;
	@FindBy(xpath="//a[.='FRESH FISH']")
	private WebElement freshfish;
	@FindBy(xpath="//button[@class='button btn-cart']")
	private WebElement addcartButton;
	public WebElement getFishmeat() {
		return fishmeat;
	}
	public WebElement getFreshmeat() {
		return freshmeat;
	}
	public WebElement getFreshfish() {
		return freshfish;
	}
	public WebElement getAddcartButton() {
		return addcartButton;
	}
    
	public void fishMeat()
	{
		Utility.moveToElement(Base.staticDriver, fishmeat);
		Reporter.log("moved to fish meat",true);
		freshfish.click();
		Reporter.log("clicked on the freshfish",true);
		addcartButton.click();
		Reporter.log("added to cart",true);
		
	}
}
