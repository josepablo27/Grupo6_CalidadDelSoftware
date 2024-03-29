package pruebas;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Busqueda {
    public static void main(String[] args) throws InterruptedException {

        // Configuracion del WebDriver y se hace el llamado de la funcion.

        
        System.setProperty("webdriver.chrome.driver", "src\\resources\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();

        WebDriver driver = new ChromeDriver(options);

        // Se ingresa a la pagina y se realiza el login.

        driver.get("https://www.automationexercise.com/login");
        Thread.sleep(2000);


        List<WebElement> correo = driver.findElements(By.name("email"));
        correo.get(0).sendKeys("busqueda@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("123");
        Thread.sleep(2000);
        driver.findElement(By.className("btn-default")).click();
        Thread.sleep(4000);

        // Entra a la pagina, y se verifica la eliminacion de imagenes productos de la interfaz.

        driver.findElement(By.xpath("//a[@href='/products']")).click();
        Thread.sleep(4000);
        driver.findElement(By.name("search")).sendKeys("Dress");
        Thread.sleep(2000);
        driver.findElement(By.className("btn-default")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@href='/products']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("search")).sendKeys("Jeans");
        Thread.sleep(2000);
        driver.findElement(By.className("btn-default")).click();
        Thread.sleep(4000);
}
}
