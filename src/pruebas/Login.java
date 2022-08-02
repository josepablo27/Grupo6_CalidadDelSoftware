package pruebas;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Login {
	public static void main(String[] args) throws InterruptedException {
		// Propiedades del WebDriver.

		System.setProperty("webdriver.chrome.driver", "src\\pruebas\\drivers\\chromedriver103.exe");
		WebDriver driver = new ChromeDriver();

		// Entrar a la pagina web.

		driver.get("https://www.automationexercise.com/brand_products/Biba");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// Entrar al apartado de "Login"

		driver.findElement(By.className("fa-lock")).click();
		Thread.sleep(2000);

		// Ingresar el correo electrónico y la contraseña

		List<WebElement> emails = driver.findElements(By.name("email"));
		emails.get(0).sendKeys("prueba7@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.name("password")).sendKeys("contrasena");
		Thread.sleep(2000);

		// Omprimir el boton de "Login"

		List<WebElement> buttons = driver.findElements(By.className("btn-default"));
		buttons.get(0).click();

		// Mostrar que la prueba pasó

		try {
			Assert.assertTrue(driver.findElement(By.tagName("b")).isEnabled());
			System.out.println("El ingreso ha sido exitoso");
			System.out.println("La cuenta se ha logueado correctamente");
		} catch (org.openqa.selenium.NoSuchElementException e02) {
			System.out.println("Hubo un error al ingresar a la cuenta");
			System.out.println("La cuenta no pudo loguearse de manera correcta");
		}
		
		Thread.sleep(6000);
		driver.quit();

	}
}
