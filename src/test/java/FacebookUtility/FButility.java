package FacebookUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FButility {
public static String gettd(int rowindex,int colindex) throws Throwable {
	FileInputStream fis=new FileInputStream("D:\\velocity\\facebook login.xlsx");
	Sheet sh = WorkbookFactory.create(fis).getSheet("sheet1");
	String data = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
	return data;
}
}
