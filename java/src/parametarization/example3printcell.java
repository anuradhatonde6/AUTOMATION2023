package parametarization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example3printcell {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Anuradha\\Downloads\\sheet2.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		int rowsize = sh.getLastRowNum();
		for(int i=0;i<=rowsize;i++) {
			double data = sh.getRow(i).getCell(4).getNumericCellValue();
			System.out.println(data);
		}
	}

}
