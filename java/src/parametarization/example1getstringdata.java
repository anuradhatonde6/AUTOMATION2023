package parametarization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example1getstringdata {
public static void main(String[] args) throws EncryptedDocumentException,IOException{
	FileInputStream file=new FileInputStream("C:\\Users\\Anuradha\\Downloads\\sheet1 (1).xlsx");
	Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
    String data1=sh.getRow(0).getCell(0).getStringCellValue();
	System.out.println(data1);
	double data2=sh.getRow(0).getCell(2).getNumericCellValue();
	System.out.println(data2);
	int data=(int)data2;
	System.out.println(data);
	boolean data3=sh.getRow(0).getCell(3).getBooleanCellValue();
	System.out.println(data3);
	int rowsize = sh.getLastRowNum();
	System.out.println(rowsize);
	System.out.println(rowsize+1);
	short cellsize = sh.getRow(3).getLastCellNum();
	System.out.println(cellsize);
}
}

