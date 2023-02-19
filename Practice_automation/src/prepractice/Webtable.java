package prepractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "G:\\drivers\\latest_version\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("scrollBy(0,1100)");
        Thread.sleep(3000);
        WebElement e1=driver.findElement(By.cssSelector("div#innings_2 :nth-child(1)"));
        List<WebElement> list=e1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));
        int count=list.size();
        System.out.println("How many rows are in innings 2 table? = "+count);
        int sum=0;
        for(int i=0;i<count-3;i++)
        {
        	String data=e1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(3)")).get(i).getText();
        	int run=Integer.parseInt(data);
        	sum=sum+run;
        }
        System.out.println("Sum of total run = "+sum);
        String run=driver.findElement(By.xpath("//*[@id=\"innings_2\"]/div[1]/div[13]/div[2]")).getText();
        int extraRun=Integer.parseInt(run);
        System.out.println("Extra run is = "+extraRun);
        int totalRun=sum+extraRun;
        System.out.println("Total run verified = "+totalRun);
        int sum0=0;
        for(int i=0;i<count-3;i++)
        {
        	String data=e1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(4)")).get(i).getText();
        	int run0=Integer.parseInt(data);
        	sum0=sum0+run0;
        }
        System.out.println("sum of total ball = "+sum0);
        int sum00=0;
        for(int i=0;i<count-3;i++)
        {
        	String data=e1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(5)")).get(i).getText();
        	int run00=Integer.parseInt(data);
        	sum00=sum00+run00;
        }
        System.out.println("Sum of 4s = "+sum00);
        driver.close();
	}

}
