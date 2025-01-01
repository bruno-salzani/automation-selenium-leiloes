package br.com.alura.leilao.login;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.alura.leilao.PageObject;
import br.com.alura.leilao.leiloes.LeiloesPage;

public class LoginPage extends PageObject {
	
	private static final String URL_LOGIN = "http://localhost:8080/login";
	
	public LoginPage() {
		
		super(null);
		browser.navigate().to(URL_LOGIN);
	}

	public void preencheFormularioDeLogin(String username, String password) {
		
		browser.findElement(By.name("username")).sendKeys(username);
		browser.findElement(By.name("password")).sendKeys(password);
	}

	public LeiloesPage efetuaLogin() {
		
		browser.findElement(By.xpath("//button[@type='submit']")).click();
		return new LeiloesPage(browser);
	}

	public boolean isPaginaDeLogin() {
		
		return browser.getCurrentUrl().equals(URL_LOGIN);
	}

	public Object getNomeUsuarioLogado() {
		
		try {
			return browser.findElement(By.id("usuario-logado")).getText();
		} catch (NoSuchElementException e) {
			return null;
		}
	}

	public void navegaParaPaginaDeLances() {
		
		browser.navigate().to("http://localhost:8080/leiloes/2");
	}

	public boolean contemTexto(String texto) {
		
		return browser.getPageSource().contains(texto);
	}

	public boolean isPaginaDeLoginComDadosInvalidos() {
		
		return browser.getCurrentUrl().equals(URL_LOGIN + "?error");
	}
}
