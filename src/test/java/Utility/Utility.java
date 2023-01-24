package Utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility {
	public static String getTD(int rowIndex, int colIndex) throws Throwable {
		FileInputStream fis=new FileInputStream("D:\\velocity\\amazon.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("sheet1");
		String data=sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		return data;
		
	}
}
