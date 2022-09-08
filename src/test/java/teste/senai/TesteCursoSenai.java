package teste.senai;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteCursoSenai {
	
	private WebDriver driver;
	
	@Before
	public void ConfigurarTeste() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OI417408\\Desktop\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	//Avisar o teste
	@Test
	public void TesteNavegabilidade () {
		
		driver.get("https://informatica.sp.senai.br/");
		
		//selecionar campo de teste
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("Software");
		
		driver.findElement(By.id("Busca1_btnBusca")).click();
	}

}
