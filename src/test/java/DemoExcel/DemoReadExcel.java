package DemoExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DemoReadExcel {
	@Test
	public void f() throws IOException {

		File src = new File("src\\test\\java\\mahFiles\\Login.xlsx");

		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int rc = sheet1.getLastRowNum();
		for(int i = 0;i<rc;i++) {

			String data1 = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Column1 value is :"+data1);

			String data2 = sheet1.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Column2 value is :"+data2);

			sheet1.getRow(0).createCell(2).setCellValue("Result");
			sheet1.getRow(1).createCell(2).setCellValue("Pass");
			sheet1.getRow(2).createCell(2).setCellValue("Fail");
			sheet1.getRow(3).createCell(2).setCellValue("Pass");

			FileOutputStream fout = new FileOutputStream(src);
			wb.write(fout);
			fout.close();



		}




	}
}
