package parametarization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example2print1row {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Anuradha\\Downloads\\sheet1 (1).xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		short cellsize = sh.getRow(3).getLastCellNum();
		for(int i=0;i<=cellsize-1;i++){
			String data = sh.getRow(3).getCell(i).getStringCellValue();		
			System.out.println(data);
		}
	}

}
