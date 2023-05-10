package parametarization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example_printalldatausingcelltype {
	public static void main(String[] args) throws IOException{
		FileInputStream file=new FileInputStream("C:\\Users\\Anuradha\\Downloads\\sheet2.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		for(int i=0;i<=sh.getLastRowNum();i++)
		{
			for(int j=0;j<=sh.getRow(i).getLastCellNum()-1;j++)
			{
				Cell cellinfo=sh.getRow(i).getCell(j);
				CellType CT=cellinfo.getCellType();
				if(CT==CellType.STRING)
				{
					System.out.println(cellinfo.getStringCellValue()+" ");	
				}
				if(CT==CellType.NUMERIC)
				{
					System.out.println(cellinfo.getNumericCellValue());
				}
				if(CT==CellType.BOOLEAN)
				{
					System.out.println(cellinfo.getBooleanCellValue());
				}

			}
			System.out.println();
		}

	}

}
