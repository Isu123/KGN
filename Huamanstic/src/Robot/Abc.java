package Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Abc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		  FirefoxDriver driver=new FirefoxDriver();
		  Thread.sleep(2000);
		  driver.get("http:www.amazon.in");
		  WebElement Isu = driver.findElement(By.xpath("(//a[.='Customer Service'])[1]"));
		 Actions Isu2 = new Actions(driver);
		  Isu2.contextClick(Isu).perform();
		  Thread.sleep(2000);
		  
		  
		  
	}

}
