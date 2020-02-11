package br.com.rsinet.hub_bdd.steps;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import br.com.rsinet.hub_bdd.pages.TelaInicial;
import cucumber.api.DataTable;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Cadastro {

	private AndroidDriver<MobileElement> driver;
	private TouchAction action;
	
	@Dado("^que inicio o aplicativo$")
	public void que_inicio_o_aplicativo() throws Throwable {
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

	@Quando("^clico no menu login$")
	public void clico_no_menu_login() throws Throwable {
		TelaInicial.btnMenu(driver).click();
		TelaInicial.btnLogin(driver).click();
	}

	@Quando("^em cadastrar novo usuario$")
	public void em_cadastrar_novo_usuario() throws Throwable {
		TelaInicial.btnCriarConta(driver).click();
	}

	@Quando("^lanço os dados de usuario$")
	public void lanço_os_dados_de_usuario(DataTable arg1) throws Throwable {
	}

	@Entao("^clico em registrar e cadastro usuario$")
	public void clico_em_registrar_e_cadastro_usuario() throws Throwable {
		TelaInicial.btnMenu(driver).click();
	}

	@Quando("^quando vou para o menu login$")
	public void quando_vou_para_o_menu_login() throws Throwable {
		TelaInicial.btnMenu(driver).click();
		TelaInicial.btnLogin(driver).click();
	}

	@Quando("^clico cadastrar um novo usuario$")
	public void clico_cadastrar_um_novo_usuario() throws Throwable {
		TelaInicial.btnCriarConta(driver).click();
	}

	@Quando("^preencho os dados de usuario$")
	public void preencho_os_dados_de_usuario(DataTable arg1) throws Throwable {
	}

	@Entao("^recebo a mensagem de email invalido$")
	public void recebo_a_mensagem_de_email_invalido() throws Throwable {
	}
}
