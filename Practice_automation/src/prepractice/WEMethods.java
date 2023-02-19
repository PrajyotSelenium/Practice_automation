package prepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WEMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "G:\\drivers\\latest_version\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/Prajyat/OneDrive/Documents/index.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement text=driver.findElement(By.xpath("//*[@id=\"headerlogin\"]/div[1]/label[2]/b"));
        String password=text.getText();
        System.out.println("Password text is = "+password);
        WebElement un=driver.findElement(By.xpath("//*[@id=\"uid\"]"));
        un.sendKeys("Prajyot123");
        String atr=un.getAttribute("value");
        System.out.println("Username text box value = "+atr);
        WebElement pw=driver.findElement(By.xpath("//*[@id=\"pid\"]"));
        pw.sendKeys("Prajyot");
        String atr0=pw.getAttribute("value");
        System.out.println("Password text box value = "+atr0);
        Thread.sleep(3000);
        un.clear();
        Thread.sleep(3000);
        pw.clear();
        Thread.sleep(3000);
        WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"browser\"]"));
        Select select=new Select(checkbox);
        select.selectByVisibleText("Internet Explore");
        Thread.sleep(3000);
        WebElement rem=driver.findElement(By.xpath("//*[@id=\"remem\"]"));
        System.out.println("Is checkbox selected before click? = "+rem.isSelected());
        rem.click();
        System.out.println("Is checkbox selected after click? = "+rem.isSelected());
        System.out.println("Is username text box displayed? = "+un.isDisplayed());
        Thread.sleep(3000);
        WebElement btn=driver.findElement(By.xpath("//*[@id=\"login\"]"));
        btn.submit();
		/*
		 * Thread.sleep(3000); driver.switchTo().alert().accept();
		 */
        Thread.sleep(3000);
        driver.close();
	}

}
