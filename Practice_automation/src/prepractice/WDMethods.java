package prepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WDMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "G:\\drivers\\latest_version\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login.php/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String title=driver.getTitle();
        System.out.println("Title of the page = "+title);
        String url=driver.getCurrentUrl();
        System.out.println("Url of current page = "+url);
        String pageSource=driver.getPageSource();
        System.out.println("Source code of current page = "+pageSource);
        driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
        Thread.sleep(3000);
        driver.navigate().to("https://www.myntra.com/headphones?utm_source=perf_bing_traffic&utm_medium=perf_bing_traffic&utm_campaign=&utm_source=bing");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.quit();
	}

}
