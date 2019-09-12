package alt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ErrorMsg {
	public static void main(String[]args){
		System.setProperty("webdriver.chrome.driver","c:\\Testing Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
	String actualerror=driver.findElement(By.xpath("//*[@id='view_container']")).getText();
		String expectederror="Enter an email or phone number";
		Assert.assertEquals(actualerror,expectederror);
}
}
