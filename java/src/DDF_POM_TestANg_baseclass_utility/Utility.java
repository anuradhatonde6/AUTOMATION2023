package DDF_POM_TestANg_baseclass_utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	public static String getTestData(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Anuradha\\Downloads\\Sheet1git (2).xlsx");
		Sheet  sh=WorkbookFactory.create(file).getSheet("Sheet1git");
		String value=sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;	
	}
	public static void captureScreenshot(WebDriver driver,int TCID) throws IOException 
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File dest=new File("C:\\Users\\Anuradha\\Downloads\\Screenshots\\Sheet1git"+ TCID + ".png");

		FileHandler.copy(src, dest);


	}
	public static String getPropertyFileData(String key) throws IOException
	{
		Properties obj=new Properties();
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"//GitHub.Properties");
		obj.load(file);
		String value=obj.getProperty(key);
		return value;

	}

}
