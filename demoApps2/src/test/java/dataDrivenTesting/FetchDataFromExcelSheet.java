package dataDrivenTesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcelSheet {

	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("C:\\Users\\panwa\\eclipse-workspace\\demoApps\\src\\test\\resources\\Book1.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(3);
		Cell cell = row.getCell(0);
		
		String candidateName = cell.getStringCellValue();
		System.out.println(candidateName);
		
		long candidatePhoneno = (long) row.getCell(2).getNumericCellValue();
		System.out.println(candidatePhoneno);
		
		boolean candidateStatus = row.getCell(3).getBooleanCellValue();
		System.out.println(candidateStatus);
		
	}

		


}
