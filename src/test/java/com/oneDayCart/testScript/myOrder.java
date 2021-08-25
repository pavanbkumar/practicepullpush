package com.oneDayCart.testScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.HomePage;
import com.oneDayCart.PageObject.Myaccount;
@Listeners(com.oneDayCart.GenericLib.ListenImp.class)
public class myOrder extends Base
{
	@Test
	public void myorderpage()
	{
		home=PageFactory.initElements(driver, HomePage.class);
		home.clickOnMyAccount();
		Myaccount myord = PageFactory.initElements(driver, Myaccount.class);
		myord.Myorder();
		Reporter.log("my order page is displayed",true);
	}

}
