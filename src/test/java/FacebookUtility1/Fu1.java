package FacebookUtility1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fu1 {
public static String getTD(int rowindex,int colindex) throws Throwable{
	FileInputStream fis=new FileInputStream("D:\\velocity\\facebook login.xlsx");
	Sheet sh = WorkbookFactory.create(fis).getSheet("sheet1");
	String data=sh.getRow(rowindex).getCell(colindex).getStringCellValue();
	return data;
}
}
