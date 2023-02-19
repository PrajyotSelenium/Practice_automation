package prepractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "G:\\drivers\\latest_version\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Datepicker.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#datepicker1")).click();
        Thread.sleep(3000);
        while (!driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText().contains("April")) {
			System.out.println("Next");
			driver.findElement(By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
        Thread.sleep(3000);
        List<WebElement> list=driver.findElements(By.cssSelector("a.ui-state-default"));
        int count=list.size();
        System.out.println("How many days are in april month? = "+count);
        for(int i=0;i<count;i++)
        {
        	String date=driver.findElements(By.cssSelector("a.ui-state-default")).get(i).getText();
        	if(date.equalsIgnoreCase("19"))
        	{
        		driver.findElements(By.cssSelector("a.ui-state-default")).get(i).click();
        	}
        }
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#datepicker2")).click();
        Thread.sleep(3000);
        Select select=new Select(driver.findElement(By.cssSelector("select[title='Change the month']")));
        select.selectByVisibleText("December");
        Thread.sleep(3000);
        Select select1=new Select(driver.findElement(By.cssSelector("select[title='Change the year']")));
        select1.selectByVisibleText("2027");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[title='Select Sunday, Dec 19, 2027']")).click();
        Thread.sleep(3000);
        driver.close();
	}

}
