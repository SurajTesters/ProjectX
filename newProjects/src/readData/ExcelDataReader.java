package readData;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader 
{
	public String fileReader(String path, int sheetno, int rowno, int colno)
	{
		String value="";
		try
		{
			FileInputStream file = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFSheet sheet = wb.getSheetAt(sheetno);
			value = sheet.getRow(rowno).getCell(colno).getStringCellValue();
		}
		catch(Exception e)
		{
			System.out.println("issue in reading data:"+e);
		}
		return value;
	}
	
	public static void main(String[] args) {
		ExcelDataReader ob= new ExcelDataReader();
		String path ="C:\\Users\\Pravesh\\eclipse-workspace\\newProjects\\SampleData\\Candidate Details.xlsx";
	
		String output = ob.fileReader(path, 0, 3, 1);
		System.out.println(output);
		 
		
	}
}
