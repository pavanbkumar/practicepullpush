package com.oneDayCart.testScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.HomePage;
import com.oneDayCart.PageObject.MyCartPage;
@Listeners(com.oneDayCart.GenericLib.ListenImp.class)
public class continueShopping extends Base
{
	@Test
	public void continueShop()
	{
		 home = PageFactory.initElements(driver, HomePage.class);
		 home.continueShopping();
		MyCartPage mycrt = PageFactory.initElements(driver, MyCartPage.class);
		mycrt.continueShopp();
		
	}

}
