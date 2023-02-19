package prepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "G:\\drivers\\latest_version\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
		
		  driver.switchTo().frame(driver.findElement(By.xpath(
		  "/html/body/main/div/div[2]/iframe")));
		  driver.findElement(By.xpath("//*[@id=\"i0\"]/th/a")).click();
		  Thread.sleep(3000); driver.findElement(By.xpath(
		  "/html/body/main/div[2]/ul/li[1]/table/tbody[2]/tr[1]/th/a")).click();
			driver.switchTo()
					.defaultContent(); 
			Thread.sleep(3000);/*
										 * Thread.sleep(3000); driver.switchTo().frame(driver.findElement(By.xpath(
										 * "/html/body/main/div/div[1]/div[1]/iframe")));
										 * driver.findElement(By.xpath("/html/body/main/ul/li[7]/a")).click();
										 * Thread.sleep(3000); driver.switchTo().defaultContent();
										 */
        driver.close();
	}

}
