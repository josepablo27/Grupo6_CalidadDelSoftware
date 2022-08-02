package pruebas;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class Carrito {

	public static void main(String[] args) throws InterruptedException {

		// Propiedades del WebDriver.

		System.setProperty("webdriver.chrome.driver", "src\\pruebas\\drivers\\chromedriver13.134.exe");
		WebDriver driver = new ChromeDriver();

		// Entrar a la pagina web.

		driver.get("https://www.automationexercise.com/brand_products/Biba");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// Entraer al apartado de "login" e iniciar sesion

		driver.findElement(By.className("fa-lock")).click();
		Thread.sleep(2000);
		List<WebElement> emails = driver.findElements(By.name("email"));
		emails.get(0).sendKeys("prueba.123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("prueba123");
		Thread.sleep(2000);
		driver.findElement(By.className("btn-default")).click();
		Thread.sleep(2000);

		// Verificar el contenido del carrito

		driver.findElement(By.className("fa-shopping-cart")).click();
		Thread.sleep(2000);
		int cantidad_carrito;
		try {
			cantidad_carrito = Integer.parseInt(driver.findElement(By.className("disabled")).getText());
		} catch (org.openqa.selenium.NoSuchElementException ex02) {
			cantidad_carrito = 0;
		}
		Thread.sleep(2000);

		// Volver al inicio

		driver.findElement(By.className("fa-home")).click();
		Thread.sleep(2000);

		// Seleccionar un producto

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(3000);
		driver.findElement(By.linkText("View Product")).click();
		Thread.sleep(2000);

		// Guardar el nombre y la cantidad del producto seleccionado y añadir al carrito

		String producto_seleccionado = driver.findElement(By.className("product-information"))
				.findElement(By.tagName("h2")).getText();
		int cantidad_seleccionada = Integer.parseInt(driver.findElement(By.id("quantity")).getAttribute("value"));
		driver.findElement(By.className("cart")).click();
		Thread.sleep(2000);

		// Ingresar al carrito

		driver.findElement(By.linkText("View Cart")).click();
		Thread.sleep(2000);

		String producto_guardado = driver.findElement(By.className("cart_description")).findElement(By.tagName("a"))
				.getText();
		int cantidad_guardada = Integer.parseInt(driver.findElement(By.className("disabled")).getText());

		// Confirmar que el producto se haya guardado

		int cantidad_actual = cantidad_guardada;
		int cantidad_esperada = cantidad_carrito + cantidad_seleccionada;

		System.out.println("Cantidad previa dentro del carrito: " + cantidad_carrito + "\n\n"
				+ "Producto seleccionado: " + producto_seleccionado + "\n" + "Cantidad seleccionada:"
				+ cantidad_seleccionada + "\n\n" + "Producto guardado: " + producto_guardado + "\n"
				+ "Cantidad guardada: " + cantidad_guardada + "\n");
		try {
			Assert.assertEquals(producto_seleccionado, producto_guardado);
			Assert.assertEquals(cantidad_actual, cantidad_esperada);
			System.out.println("El producto fue agregado correctamente");
		} catch (java.lang.AssertionError ex01) {
			System.out.println("Hubo un error al agregar el producto al carrito");
		}

		Thread.sleep(6000);
		driver.quit();

	}

}
