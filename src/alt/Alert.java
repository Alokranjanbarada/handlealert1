package alt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[]args){
		System.setProperty("webdriver.chrome.driver","c:\\Testing Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php?lwv=200");
		driver.findElement(By.id("email")).sendKeys("alokkumar");
		driver.findElement(By.id("pass")).sendKeys("alok1234");
		driver.findElement(By.id("loginbutton")).click();
		
		
	}


	}
	
	

