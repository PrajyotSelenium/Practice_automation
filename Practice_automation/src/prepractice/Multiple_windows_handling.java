package prepractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiple_windows_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "G:\\drivers\\latest_version\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.infosys.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        List<WebElement> list=driver.findElements(By.tagName("a"));
        int count=list.size();
        System.out.println("How many hyper links are present into this current page? = "+count);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("scrollBy(0,8000)");
        Thread.sleep(3000);
        WebElement footer=driver.findElement(By.xpath("//*[@id=\"footer\"]/article/div[1]"));
        List<WebElement> list0=footer.findElements(By.tagName("a"));
        int size0=list0.size();
        System.out.println("How many hyper links are present under footer section? = "+size0);
        WebElement div2=footer.findElement(By.xpath("//*[@id=\"footer\"]/article/div[1]/div/div[2]"));
        List<WebElement> list00=div2.findElements(By.tagName("a"));
        int count0=list00.size();
        System.out.println("How many hyper links are present in div2? = "+count0);
        for(int i=0;i<count0;i++)
        {
        	Thread.sleep(3000);
        	String keys=Keys.chord(Keys.CONTROL,Keys.ENTER);
        	div2.findElements(By.tagName("a")).get(i).sendKeys(keys);
        }
        Set<String> windows=driver.getWindowHandles();
        ArrayList<String> al=new ArrayList<String>(windows);
        Iterator<String> itr=al.iterator();
        while (itr.hasNext()) {
			Thread.sleep(3000);
			driver.switchTo().window(itr.next());
			String title=driver.getTitle();
			System.out.println("Current page title name = "+title);
			if (title.equalsIgnoreCase("Management Consulting Services | Infosys")) {
				Actions action=new Actions(driver);
				action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/div[1]/div/section/article/div/div/div/div/nav/ol/li[2]/a"))).build().perform();
				Thread.sleep(3000);
				action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/div[1]/div/section/article/div/div/div/div/nav/ol/li[2]/ul/li[1]/ul/li[4]/a"))).click().build().perform();
				Thread.sleep(3000);
			} else if(title.equalsIgnoreCase("Business Process Management Services | BPM Services | BPO Services| Infosys BPM")){
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/header/nav/div[1]/div[2]/ul/li[1]/a")).click();
                Thread.sleep(3000);
			}
		}
		 driver.quit(); 
	}

}
