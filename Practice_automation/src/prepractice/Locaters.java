package prepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locaters {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "G:\\drivers\\latest_version\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/Prajyat/OneDrive/Documents/index.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("div.container input:nth-of-type(1)")).sendKeys("Prajyot123!@#$");
        driver.findElement(By.cssSelector("div.container input:nth-of-type(2)")).sendKeys("Prajyot123");
        Thread.sleep(3000);
        Select select=new Select(driver.findElement(By.cssSelector("div.container select:nth-of-type(1)")));
        select.selectByVisibleText("Firefox");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("div.container input#remem:nth-of-type(1)")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("div.container button:nth-of-type(1)")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.close();
	}

}
