package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DWS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "G:\\drivers\\latest_version\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/register");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Prajyot");
        driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Gujarkar");
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("prajyotgujarkar9@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Prajyot123");
        driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("Prajyot123");
        driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait w=new WebDriverWait(driver, 10);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"RememberMe\"]")));
        driver.findElement(By.xpath("//*[@id=\"RememberMe\"]")).click();
        Thread.sleep(3000);
        driver.close();
	}

}
