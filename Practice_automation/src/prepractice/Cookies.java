package prepractice;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "G:\\drivers\\latest_version\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        Set<Cookie> cookies=driver.manage().getCookies();
        for(Cookie cookie:cookies)
        {
        	System.out.println("Details of cookies");
        	System.out.println("Name of cookies = "+cookie.getName());
        	System.out.println("Domain of cookies = "+cookie.getDomain());
        	System.out.println("Class name of cookies = "+cookie.getClass());
        	System.out.println("Values of cookies = "+cookie.getValue());
        	System.out.println("Path of cookies = "+cookie.getPath());
        	System.out.println("Expiry date and time information of cookies = "+cookie.getExpiry());
        	System.out.println("Is http only? = "+cookie.isHttpOnly());
        	System.out.println("Is cookie secure? = "+cookie.isSecure());
        	System.out.println("==========================================================================");
        }
		/*
		 * driver.manage().deleteCookieNamed("NID");
		 * driver.manage().deleteCookieNamed("AEC");
		 */
        driver.manage().deleteAllCookies();
        System.out.println("After deleted all cookies");
        Set<Cookie> cookies0=driver.manage().getCookies();
        for(Cookie cookie:cookies0)
        {
        	System.out.println("Details of cookies");
        	System.out.println("Name of cookies = "+cookie.getName());
        	System.out.println("Domain of cookies = "+cookie.getDomain());
        	System.out.println("Class name of cookies = "+cookie.getClass());
        	System.out.println("Values of cookies = "+cookie.getValue());
        	System.out.println("Path of cookies = "+cookie.getPath());
        	System.out.println("Expiry date and time information of cookies = "+cookie.getExpiry());
        	System.out.println("Is http only? = "+cookie.isHttpOnly());
        	System.out.println("Is cookie secure? = "+cookie.isSecure());
        	System.out.println("==========================================================================");
        }
        driver.close();
	}

}
