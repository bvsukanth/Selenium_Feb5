package SeleniumTraining;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class exceldataProvider {

	// using apache poi
	
	DataFormatter formatter = new DataFormatter();

	@Test (dataProvider = "getData")
	public void testCaseData(String username, String password, String id) {
		System.out.println(username);
		System.out.println(password);
		System.out.println(id);
		System.out.println("********************************");
	}

	@DataProvider
	public Object[][] getData() throws FileNotFoundException, IOException {
		XSSFWorkbook excel = new XSSFWorkbook(new FileInputStream("C:\\Users\\Hanvith\\Desktop\\DemoData1.xlsx"));
		XSSFSheet sheet = excel.getSheetAt(0);

		// code for getting rows
		int rowCount = sheet.getPhysicalNumberOfRows();

		// code for getting columncount
		XSSFRow row = sheet.getRow(0);
		int columncount = row.getLastCellNum();

		Object data[][] = new Object[rowCount - 1][columncount];

		// 1st for loop for rows
		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);

			// 2nd for loop for columns
			for (int j = 0; j < columncount; j++) {
				XSSFCell cell = row.getCell(j);
				
				data[i][j] = formatter.formatCellValue(cell);
			}
		}
		
		return data;
	}

}
