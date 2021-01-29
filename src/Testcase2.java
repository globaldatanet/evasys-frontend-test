import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\girin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www01.evasys.de/globaldata");	
		driver.findElement(By.id("ada1")).sendKeys("Swethaaa");
		driver.findElement(By.id("ada2")).sendKeys("wrongpassword");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//legend[@class='message']")).getText());
	
		
		//System.out.println(driver.getTitle());
		System.out.println("Testcase 2 passed");
		

	}

}