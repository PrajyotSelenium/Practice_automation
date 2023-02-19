package properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excel_read_write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      FileInputStream fis=new FileInputStream("G:\\excel\\test.xls");
      HSSFWorkbook workbook=new HSSFWorkbook(fis);
      HSSFSheet sheet=workbook.getSheet("Sheet1");
      int rowno=sheet.getLastRowNum();
      System.out.println("Last row index = "+rowno);
      int rowc=rowno+1;
      System.out.println("How many rows are in given sheet? = "+rowc);
      sheet.getRow(0).createCell(5).setCellValue("New pw");
      sheet.getRow(1).createCell(5).setCellValue("XXXXXXXXXXX");
      FileOutputStream fos=new FileOutputStream("G:\\excel\\test.xls");
      workbook.write(fos);
	}

}
