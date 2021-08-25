package com.oneDayCart.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.oneDayCart.GenericLib.Utility;

public class Myaccount 
{
	@FindBy(xpath="//a[.='Account Dashboard']")
	private WebElement accountDash;
	
	@FindBy(xpath="//a[.='Account Information']")
	private WebElement accountInfo;
	
	@FindBy(xpath="//a[.='Address Book']")
	private WebElement addBook;
	
	@FindBy(xpath="//a[.='My Orders']")
	private WebElement myOrder;
	
	@FindBy(xpath="//h1[.='My Orders']")
	private WebElement myOrderInfo;
	
	@FindBy(xpath="//h1[.='My Wallet Cash']")
	private WebElement mywalletcashInfo;
	
	@FindBy(xpath="//a[.='Newsletter Subscriptions']")
	private WebElement subButton;
	
	@FindBy(xpath="(//a[@href='http://onedaycart.com/customer/account/'])[3]")
	private WebElement backlink;
	
	public WebElement getBacklink() {
		return backlink;
	}

	public WebElement getSubButton() {
		return subButton;
	}

	public WebElement getMywalletcashInfo() {
		return mywalletcashInfo;
	}

	public WebElement getAccountDash() {
		return accountDash;
	}

	public WebElement getAccountInfo() {
		return accountInfo;
	}

	public WebElement getAddBook() {
		return addBook;
	}

	public WebElement getMyOrder() {
		return myOrder;
	}

	public WebElement getRecurringProf() {
		return recurringProf;
	}

	public WebElement getBillingAggreem() {
		return billingAggreem;
	}

	public WebElement getMywalletCash() {
		return mywalletCash;
	}

	@FindBy(xpath="//strong[.='Recurring Profiles']")
	private WebElement recurringProf;
	
	@FindBy(xpath="//a[.='Billing Agreements']")
	private WebElement billingAggreem;
	
	@FindBy(xpath="//a[.='My Wallet Cash']")
	private WebElement mywalletCash;
 

	
	public WebElement getMyOrderInfo() {
		return myOrderInfo;
	}

	public void Mywallet(WebDriver driver)
	{
		Utility.scrollBy(mywalletCash.getLocation().getY());
		mywalletCash.click();
		Reporter.log("click on my wallet cash", true);
		String text = mywalletcashInfo.getText();
	    Assert.assertTrue(text.equalsIgnoreCase("MY WALLET CASH"));
	}
	
	public void Myorder()
	{
		Utility.scrollBy(myOrder.getLocation().getY());
		myOrder.click();
		Reporter.log("click on my order", true);
		String text = myOrderInfo.getText();
		Assert.assertTrue(text.equalsIgnoreCase("MY ORDERS"));
	}
	
	public void subButton()
	{
		Utility.scrollBy(subButton.getLocation().getY());
		subButton.click();
		Reporter.log("clicked on subscription",true);
		backlink.click();
		Reporter.log("clicked on back link",true);
	}
}
