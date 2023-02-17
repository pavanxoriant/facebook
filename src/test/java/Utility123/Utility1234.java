package Utility123;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility1234 {
public static String getTD(int rowindex,int colindex) throws Throwable {
	FileInputStream fis=new FileInputStream("D:\\velocity\\facebook login.xlsx");
	Sheet sh = WorkbookFactory.create(fis).getSheet("sheet1");
	String data=sh.getRow(rowindex).getCell(colindex).getStringCellValue();
	return data;
	reporter.log("pavan",true);
	pavan
}
}
