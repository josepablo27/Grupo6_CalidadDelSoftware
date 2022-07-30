package pruebas;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class Signup {

	public static void main(String[] args) throws InterruptedException {

		// Propiedades del WebDriver.

		System.setProperty("webdriver.chrome.driver", "src\\pruebas\\drivers\\chromedriver13.134.exe");
		WebDriver driver = new ChromeDriver();

		// Entrar a la pagina web.

		driver.get("https://www.automationexercise.com/brand_products/Biba");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Entrar al apartado de "Signup"
		
		driver.findElement(By.className("fa-lock")).click();
		Thread.sleep(2000);
		
		// Ingresar un nombre y un correo electrónico
		
		driver.findElement(By.name("name")).sendKeys("Jose Pablo");
		Thread.sleep(2000);
		List<WebElement> emails = driver.findElements(By.name("email"));
		emails.get(1).sendKeys("prueba7@gmail.com");
		Thread.sleep(2000);
		
		// Omprimir el boton de "Signup"
		
		List<WebElement> buttons = driver.findElements(By.className("btn-default"));
		buttons.get(1).click();
		
		// Llenar el formulario y oprimir el boton de "Create Account"

		List<WebElement> genero = driver.findElements(By.className("top"));
		genero.get(0).click();
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("contrasena");
		Thread.sleep(2000);
		driver.findElement(By.id("first_name")).sendKeys("Jose Pablo");
		Thread.sleep(2000);
		driver.findElement(By.id("last_name")).sendKeys("Duran Madrigal");
		Thread.sleep(2000);
		driver.findElement(By.id("address1")).sendKeys("Alabama");
		Thread.sleep(2000);
		driver.findElement(By.id("state")).sendKeys("Rumania");
		Thread.sleep(2000);
		driver.findElement(By.id("city")).sendKeys("Toronto");
		Thread.sleep(2000);
		driver.findElement(By.id("zipcode")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.id("mobile_number")).sendKeys("888888888");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.className("btn-default")).click();
		
		// Oprimir el boton de "Continue"
		
		driver.findElement(By.className("btn-primary")).click();
		Thread.sleep(3500);
		
		// Confirmar que el usuario se haya guardado
		
		String usuario_guardado = driver.findElement(By.tagName("b")).getText();
		String usuario_ingresado = "Jose Pablo";
		
		System.out.println("Usuario Ingresado: " + usuario_ingresado + "\n\n"
				+ "Usuario Guardado: " + usuario_guardado + "\n");
		try {
			Assert.assertEquals(usuario_ingresado, usuario_guardado);
			System.out.println("El usuario se registró con éxito");
		} catch(java.lang.AssertionError ex01) {
			System.out.println("Hubo un error al registrar el usuario");
		}
		
		Thread.sleep(6000);
		driver.quit();
	
	}

}
