package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
        Properties pro=new Properties();
        
        FileInputStream src=new FileInputStream("G:\\properties\\test.properties");
        
        pro.load(src);
        
        System.setProperty(pro.getProperty("driver"), pro.getProperty("locate"));
        WebDriver driver=new ChromeDriver();
        driver.get(pro.getProperty("url"));
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).click();
        Thread.sleep(3000);
        FileInputStream f=new FileInputStream("G:\\excel\\test.xls");
        HSSFWorkbook workbook=new HSSFWorkbook(f);
        HSSFSheet sheet=workbook.getSheet("Sheet1");
        DataFormatter format=new DataFormatter();
        HSSFRow row1=sheet.getRow(1);
        HSSFCell column1=row1.getCell(0);
        driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys(format.formatCellValue(column1));
        HSSFRow row01=sheet.getRow(1);
        HSSFCell column2=row01.getCell(1);
        driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys(format.formatCellValue(column2));
        HSSFRow row001=sheet.getRow(1);
        HSSFCell column3=row001.getCell(2);
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(column3.getStringCellValue());
        Thread.sleep(3000);
        HSSFRow row0001=sheet.getRow(1);
        HSSFCell column4=row0001.getCell(3);
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(column4.getStringCellValue());
        HSSFRow row00001=sheet.getRow(1);
        HSSFCell column5=row00001.getCell(4);
        driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys(column5.getStringCellValue());
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(column3.getStringCellValue());
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(column4.getStringCellValue());
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"RememberMe\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
        Thread.sleep(3000);
        driver.close();
	}

}
