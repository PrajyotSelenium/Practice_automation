package prepractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "G:\\drivers\\latest_version\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/Prajyat/OneDrive/Documents/table.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        List<WebElement> list=driver.findElements(By.tagName("tr"));
        int count=list.size();
        System.out.println("How many rows are in given table? = "+count);
        for(int i=0;i<count;i++)
        {
        	String data=driver.findElements(By.tagName("tr")).get(i).getText();
        	System.out.println("Row wise data = "+data);
        }
        for(WebElement e:list)
        {
        	List<WebElement> list0=e.findElements(By.tagName("td"));
        	for(WebElement td:list0)
        	{
        		System.out.println("Column wise data = "+td.getText());
        	}
        }
        WebElement list0=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
		System.out.println("First row data = "+list0.getText()); 
        List<WebElement> list00=driver.findElements(By.xpath("/html/body/table/tbody/tr[1]"));
        for(WebElement e:list00)
        {
        	System.out.println("1st row data = "+e.getText());
        }
        WebElement e0=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[1]"));
        System.out.println("First row first column data = "+e0.getText());
        driver.close();
	}

}
