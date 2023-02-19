package prepractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "G:\\drivers\\latest_version\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ksrtc.in/oprs-web/guest/home.do?h=1");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("scrollBy(0,350)");
        Thread.sleep(3000);
        WebElement e1=driver.findElement(By.id("fromPlaceName"));
        e1.click();
        Thread.sleep(3000);
        e1.sendKeys("BENG");
        Thread.sleep(3000);
        String value="return document.getElementById(\"fromPlaceName\").value;";
        String city=(String)js.executeScript(value);
        System.out.println("What we typed inside leaving from text box? = "+city);
        while (!city.equalsIgnoreCase("BENGALURU AIRPORT")) {
			Thread.sleep(3000);
			e1.sendKeys(Keys.DOWN);
			value="return document.getElementById(\"fromPlaceName\").value;";
			city=(String)js.executeScript(value);
			System.out.println("Print upto bengaluru airport = "+city);
		}
        Thread.sleep(3000);
        e1.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#txtJourneyDate")).click();
        Thread.sleep(3000);
        while (!driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText().contains("March")) {
			System.out.println("Next");
			driver.findElement(By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
        Thread.sleep(3000);
        List<WebElement> list=driver.findElements(By.cssSelector("a.ui-state-default"));
        int count=list.size();
        System.out.println("How many days are available in march month of date of departure? = "+count);
        for(int i=0;i<count-1;i++)
        {
        	String date=driver.findElements(By.cssSelector("a.ui-state-default")).get(i).getText();
        	if(date.equalsIgnoreCase("7"))
        	{
        		driver.findElements(By.cssSelector("a.ui-state-default")).get(i).click();
        	}
        }
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#txtReturnJourneyDate")).click();
        Thread.sleep(3000);
        while (!driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText().contains("March")) {
			System.out.println("Next");
			driver.findElement(By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
        Thread.sleep(3000);
        List<WebElement> list0=driver.findElements(By.cssSelector("a.ui-state-default"));
        int count0=list0.size();
        System.out.println("How many days are available in march month of date of return? = "+count0);
        for(int i=0;i<count0-1;i++)
        {
        	String date=driver.findElements(By.cssSelector("a.ui-state-default")).get(i).getText();
        	if (date.equalsIgnoreCase("7")) {
				driver.findElements(By.cssSelector("a.ui-state-default")).get(i).click();
			}
        }
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[2]/div/div[3]/div/label")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.close();
	}

}
