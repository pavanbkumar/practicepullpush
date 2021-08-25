package com.oneDayCart.PageObject;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Assert;
import org.testng.Reporter;

import com.oneDayCart.GenericLib.Utility;

public class MyCartPage {
	@FindBy(xpath="//span[.='Clear Shopping Cart']")
	private WebElement clearShopingCartBT;
	@FindBy(xpath="//span[.='Update Shopping Cart']")
	private WebElement updateShopingCartBT;
	@FindBy(xpath="(//span[.='Continue Shopping'])[2]")
	private WebElement continueShoppigBT;
	@FindBys({
		@FindBy(xpath="//a[@title='Remove item']")
	})
	private List<WebElement> removeBT;
	
	@FindBy(xpath="//a[@title='Remove item']")
	private WebElement removeButton;
	
	@FindBy(xpath="//h1[.='Shopping Cart is Empty']")
	private WebElement emptyCart;
	
	@FindBy(xpath="//a[.='Move']")
	private WebElement moveLink;

	public WebElement getMoveLink() {
		return moveLink ;
	}
	public WebElement getEmptyCart() {
		return emptyCart;
	}
	public WebElement getClearShopingCartBT() {
		return clearShopingCartBT;
	}
	public WebElement getUpdateShopingCartBT() {
		return updateShopingCartBT;
	}
	public WebElement getContinueShoppigBT() {
		return continueShoppigBT;
	}
	
	
	public List<WebElement> getRemoveBT() {
		return removeBT;
	}
	public WebElement getRemoveButton() {
		return removeButton;
	}
	public void removeItem() {
		Reporter.log("removing item from cart", true);
		removeButton.click();
			
		
	}
	public void clearShoppingCart() {
		int y=clearShopingCartBT.getLocation().getY();
		Utility.scrollBy(y);
		clearShopingCartBT.click();
		Reporter.log("cleared cart items", true);
		Assert.assertTrue(emptyCart.getText().equalsIgnoreCase("SHOPPING CART IS EMPTY"));
	}
	
	public void moveToWishList() {
		Reporter.log("move items to wishlist",true);
		moveLink.click();
	}
	public void continueShopp()
	{
		Utility.scrollBy(continueShoppigBT.getLocation().getY());
		continueShoppigBT.click();
		Reporter.log("click on continue shopping", true);
	}
}
