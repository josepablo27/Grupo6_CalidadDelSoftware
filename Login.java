package pruebas;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Login {
	
	public static void main(String[] args) {
		 
		//Modificaci�n
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.automationexercise.com/brand_products/Biba");
		
		
	}
}
