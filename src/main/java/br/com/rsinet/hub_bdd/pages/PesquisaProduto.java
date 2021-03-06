package br.com.rsinet.hub_bdd.pages;

import org.openqa.selenium.By;

import br.com.rsinet.hub_bdd.pages.PesquisaProduto;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PesquisaProduto {

	private static MobileElement element;
	private static AndroidDriver<?> driver;

	public void PesquisaPLupa(AndroidDriver<?> driver) {
		PesquisaProduto.driver = driver;
	}
	
	public static MobileElement btnProduto(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.xpath(
				"//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]"));
	}
	
	public static MobileElement btnNoteBook(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.xpath(
				"//android.widget.RelativeLayout[@content-desc=\"Laptops\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]/android.widget.ImageView"));
	}
	
	public static MobileElement btnQuantidade(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/linearLayoutProductQuantity"));
	}
	
	public static MobileElement btnQtd(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductQuantity"));
	}
	
	public static MobileElement btnAplly(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/textViewApply"));
	}
	
	public static MobileElement btnAddToCart(AndroidDriver<?> driver) {
		return (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/buttonProductAddToCart"));
	}
}
