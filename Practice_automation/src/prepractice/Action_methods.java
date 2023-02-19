package prepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "G:\\drivers\\latest_version\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
        Actions action=new Actions(driver);
		/*
		 * action.moveToElement(driver.findElement(By.xpath(
		 * "//*[@id=\"secondarypbt\"]/div[1]/form/label/input"))).click().build().
		 * perform(); Thread.sleep(3000);
		 * action.moveToElement(driver.findElement(By.xpath(
		 * "//*[@id=\"secondarypbt\"]/div[1]/form/label/input"))).
		 * sendKeys("Software Testing").build().perform();
		 */
        WebElement source=driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
        WebElement target=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
        action.dragAndDrop(source, target).clickAndHold().release().build().perform();
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        driver.close();
	}

}
