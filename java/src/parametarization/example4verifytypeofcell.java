package parametarization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example4verifytypeofcell {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Anuradha\\Downloads\\sheet2.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("sheet1");
          CellType CT = sh.getRow(0).getCell(3).getCellType();
          System.out.println(CT);
	}

}