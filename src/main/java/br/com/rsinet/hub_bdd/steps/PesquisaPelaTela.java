package br.com.rsinet.hub_bdd.steps;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import br.com.rsinet.hub_bdd.pages.TelaInicial;
import br.com.rsinet.hub_bdd.pages.PesquisaProduto;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class PesquisaPelaTela {

	private AndroidDriver<MobileElement> driver;
	private TouchAction action;
	
	@Dado("^que o  aplicativo é aberto$")
	public void que_o_aplicativo_é_aberto() throws Throwable {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Renan");
		capabilities.setCapability("udid", "emulator-5554");
		capabilities.setCapability("platformName", "Android ");
		capabilities.setCapability("platformVersion", "9");
		capabilities.setCapability("appPackage", "com.Advantage.aShopping");
		capabilities.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver(url, capabilities);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	}

	@Quando("^clico em laptops$")
	public void clico_em_laptops() throws Throwable {
		TelaInicial.btnLaptops(driver).click();
	}

	@Quando("^clico no produto$")
	public void clico_no_produto() throws Throwable {
		PesquisaProduto.btnNoteBook(driver).click();
	}

	@Entao("^me abre  a tela do produto$")
	public void me_abre_a_tela_do_produto() throws Throwable {
	}

	@Quando("^logo no aplicativo$")
	public void logo_no_aplicativo() throws Throwable {
		TelaInicial.btnMenu(driver).click();
		TelaInicial.btnLogin(driver).click();
		TelaInicial.btnUserName(driver).click();
		TelaInicial.btnUserName(driver).sendKeys("RenanMarcos1");
		TelaInicial.btnPassword(driver).click();
		TelaInicial.btnPassword(driver).sendKeys("@Test123");
		TelaInicial.btnLogar(driver).click();
	}

	@Quando("^clico no menu laptops$")
	public void clico_no_menu_laptops() throws Throwable {
		TelaInicial.btnLaptops(driver).click();
	}

	@Quando("^clico no produto desejado$")
	public void clico_no_produto_desejado() throws Throwable {
		PesquisaProduto.btnNoteBook(driver).click();
	}

	@Quando("^adiciono no carrinho  produtos$")
	public void adiciono_no_carrinho_os_produtos() throws Throwable {
		PesquisaProduto.btnQuantidade(driver).click();
		PesquisaProduto.btnQtd(driver).click();
		PesquisaProduto.btnQtd(driver).sendKeys("8");
		PesquisaProduto.btnAplly(driver).click();
		PesquisaProduto.btnAddToCart(driver).click();
	}

	@Entao("^o aplicativo adiciona apenas  no carrinho$")
	public void o_aplicativo_nao_adiciona_tudo_no_carrinho() throws Throwable {
	}
}
