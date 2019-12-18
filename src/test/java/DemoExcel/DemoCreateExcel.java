package DemoExcel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.testng.annotations.Test;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class DemoCreateExcel {


	@Test
	public void f() throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook();
		FileOutputStream out = new FileOutputStream(new File("demobloodseeker.xlsx"));

		wb.write(out);
		out.close();
		System.out.println("File created successfully");  				  
	}
}
