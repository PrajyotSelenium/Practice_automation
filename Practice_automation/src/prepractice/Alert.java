package prepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "G:\\drivers\\latest_version\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Software Testing");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        WebElement e=driver.findElement(By.xpath("//*[@id=\"promptResult\"]"));
        String text=e.getText();
        System.out.println("Message from pop up window = "+text);
        Thread.sleep(3000);
        driver.close();
	}

}
