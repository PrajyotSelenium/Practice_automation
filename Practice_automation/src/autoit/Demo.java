package autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "G:\\drivers\\latest_version\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.adobe.com/acrobat/online/pdf-to-word.html?mv=search&sdid=DZTGZX2P&ef_id=b3be4c17c71b1daa06d32ff8698f56d4:G:s&s_kwcid=AL!3085!10!78752703303326!78753042230333&mv=search");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"lifecycle-nativebutton\"]")).click();
        Thread.sleep(3000);
        Runtime.getRuntime().exec("G:\\AutoIT\\jar1.exe");
        Thread.sleep(7000);
	    driver.close(); 
	}

}
