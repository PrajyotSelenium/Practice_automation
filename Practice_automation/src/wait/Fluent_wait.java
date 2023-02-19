package wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "G:\\drivers\\latest_version\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("scrollBy(0,350)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"post-body-5280210221385817166\"]/div[1]/button")).click();
        Wait<WebDriver> w=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
        WebElement e=w.until(new Function<WebDriver, WebElement>() {
        	@Override
        	public WebElement apply(WebDriver wd)
        	{
        		WebElement msg=wd.findElement(By.xpath("//*[@id=\"demo\"]"));
        		System.out.println("Fluent wait");
        		String message=msg.getText();
        		System.out.println("Message is = "+message);
        		if (message.equalsIgnoreCase("Software Testing Material - DEMO PAGE")) {
					return msg;
				} else {
                    return null;
				}
        	}
		});
	}

}
