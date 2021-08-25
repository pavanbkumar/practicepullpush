package com.oneDayCart.testScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.HomePage;
import com.oneDayCart.PageObject.MyCartPage;
import com.oneDayCart.PageObject.MyWishListPage;

@Listeners(com.oneDayCart.GenericLib.ListenImp.class)
public class DeleteWishListTest extends Base{
	@Test
	public void deleteWishlistTest() {
		home=PageFactory.initElements(driver, HomePage.class);
		home.clickOnMycart();
		MyCartPage mycart = PageFactory.initElements(driver, MyCartPage.class);
		mycart.moveToWishList();
		home.clickOnMyWishlist();
		MyWishListPage mywish = PageFactory.initElements(driver, MyWishListPage.class);
		mywish.removeItem();
	}
}
