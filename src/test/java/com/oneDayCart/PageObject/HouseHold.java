package com.oneDayCart.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.GenericLib.Utility;

public class HouseHold 
{
	@FindBy(xpath="//a[.='HOUSEHOLD']")
    private WebElement household;
	@FindBy(xpath="//a[.='Shoe Polish']")
	private WebElement shoebrush;
	@FindBy(xpath="//button[@class='button btn-cart']")
	private WebElement addcart;
	@FindBy(xpath="//a[.='Shoe Brush']")
	private WebElement shoepolish;
	public WebElement getShoepolish() {
		return shoepolish;
	}
	public WebElement getHousehold() {
		return household;
	}
	public WebElement getShoebrush() {
		return shoebrush;
	}
	public WebElement getAddcart() {
		return addcart;
	}
	
	public void Shoe()
	{
		Utility.moveToElement(Base.staticDriver, household);
		Reporter.log("moved to house hold",true);
		shoebrush.click();
		Reporter.log("shoebrush is clicked",true);
		addcart.click();
		Reporter.log("added to cart");
		Utility.moveToElement(Base.staticDriver, household);
		Reporter.log("moved to house hold",true);
		shoepolish.click();
		Reporter.log("clicked on shoe polish",true);
		addcart.click();
		Reporter.log("added to cart");
	}

}
