package pruebas;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bug2 {

	public static void main(String[] args) throws InterruptedException {
		
		// Propiedades del WebDriver.
		System.setProperty("webdriver.chrome.driver", "src\\resources\\drivers\\chromedriver103.exe");
		WebDriver driver = new ChromeDriver();
		
		// Entrar a la pagina web.
		driver.get("https://www.automationexercise.com/brand_products/Biba");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// Entrar al apartado de "Login"

		driver.findElement(By.className("fa-lock")).click();
		Thread.sleep(2000);

		
		// Ingresar el correo electr�nico y la contrase�a

		List<WebElement> emails = driver.findElements(By.name("email"));
		emails.get(0).sendKeys("bug2@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.name("password")).sendKeys("123");
		Thread.sleep(2000);
		
		// Oprimir el boton de "Login"

		List<WebElement> buttons = driver.findElements(By.className("btn-default"));
		buttons.get(0).click();
	
		
		// Oprimir el boton de "Delete Account"
		Thread.sleep(2000);
		driver.findElement(By.className("fa-trash-o")).click();

		
	}

}
