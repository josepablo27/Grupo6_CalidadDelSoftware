package pruebas;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bug1 {
	public static void main(String[] args) throws InterruptedException {

		// Propiedades del WebDriver.

		System.setProperty("webdriver.chrome.driver", "src\\pruebas\\drivers\\chromedriver13.134.exe");
		WebDriver driver = new ChromeDriver();

		// Entrar a la pagina web.

		driver.get("https://www.automationexercise.com/brand_products/Biba");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// Entrar a los detalles del producto.
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		driver.findElement(By.className("fa-plus-square")).click();
		Thread.sleep(2000);

		// Ingresar una cantidad del producto y aï¿½adirlo al carrito.

		driver.findElement(By.id("quantity")).sendKeys("1000000000000000000");
		Thread.sleep(2000);
		driver.findElement(By.className("cart")).click();
		Thread.sleep(2000);

		// Oprimir el botón de "Seguir comprando".

		driver.findElement(By.className("btn-block")).click();
		Thread.sleep(2000);

		// Entrar al carrito

		driver.findElement(By.className("fa-shopping-cart")).click();
		Thread.sleep(2000);

		// Oprimir proceder a comprar el producto

		driver.findElement(By.className("check_out")).click();
		Thread.sleep(2000);

		// Elegir la opcion de login

		List<WebElement> login = driver.findElements(By.className("text-center"));
		login.get(1).click();
		Thread.sleep(2000);

		// Ingresar el correo y contraseña y oprimir "login"

		List<WebElement> emails = driver.findElements(By.name("email"));
		emails.get(0).sendKeys("prueba.123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("prueba123");
		Thread.sleep(2000);
		driver.findElement(By.className("btn-default")).click();

		// Volver a entrar al carrito

		Thread.sleep(2000);
		driver.findElement(By.className("fa-shopping-cart")).click();

	}

}
