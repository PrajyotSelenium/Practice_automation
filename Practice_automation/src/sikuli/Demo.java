package sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Demo {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "G:\\drivers\\latest_version\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        Screen screen=new Screen();
        Pattern un=new Pattern("G:\\Sikuli\\SikuliDemo\\username.PNG");
        Pattern pw=new Pattern("G:\\Sikuli\\SikuliDemo\\password.PNG");
        Pattern btn=new Pattern("G:\\Sikuli\\SikuliDemo\\submit.PNG");
        screen.type(un,"Prajyot123");
        screen.type(pw,"Prajyot");
        screen.click(btn);
        Thread.sleep(3000);
        driver.close();
	}

}
