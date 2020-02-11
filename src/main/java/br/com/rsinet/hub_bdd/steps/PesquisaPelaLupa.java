package br.com.rsinet.hub_bdd.steps;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_bdd.pages.TelaInicial;
import br.com.rsinet.hub_bdd.pages.PesquisaProduto;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Então;
import io.appium.java_client.android.AndroidDriver;

public class PesquisaPelaLupa {
	
	public static AndroidDriver<?> driver;
	public static WebDriverWait wait;

	@Dado("^que o aplicativo é iniciado$")
	public void que_o_aplicativo_é_iniciado() throws Throwable {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Renan");
		capabilities.setCapability("udid", "emulator-5554");
		capabilities.setCapability("platformName", "Android ");
		capabilities.setCapability("platformVersion", "9");
		capabilities.setCapability("appPackage", "com.Advantage.aShopping");
		capabilities.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");
		capabilities.setCapability("unicodeKeyboard", true);
		capabilities.setCapability("resetKeyboard", true);

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver(url, capabilities);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	}

	@Quando("^pesquiso um produto pela barra$")
	public void pesquiso_um_produto_pela_barra() throws Throwable {
		TelaInicial.btnBarra(driver).click();
		TelaInicial.btnBarra(driver).sendKeys("Tablet");
		TelaInicial.btnLupa(driver).click();
	}

	@Quando("^clico nele$")
	public void clico_nele() throws Throwable {
		PesquisaProduto.btnProduto(driver).click();
	}

	@Entao("^abre  a tela do produto$")
	public void abre_a_tela_do_produto() throws Throwable {
	}

	@Quando("^fasso a pesquisa do produto pela barra$")
	public void fasso_a_pesquisa_do_produto_pela_barra() throws Throwable {
		TelaInicial.btnBarra(driver).click();
		TelaInicial.btnBarra(driver).sendKeys("Microfone");
		TelaInicial.btnLupa(driver).click();
	}

	@Então("^aparece a messangem produto não encontrado$")
	public void aparece_a_messangem_produto_não_encontrado() throws Throwable {
	}

}
