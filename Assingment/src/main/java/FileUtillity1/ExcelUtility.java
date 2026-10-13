package FileUtillity1;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	


		public String getDataFRomExcel(String sheetName, int rowNum, int celNum) throws Throwable {

			FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			String data = wb.getSheet(sheetName).getRow(rowNum).getCell(celNum).getStringCellValue();
			wb.close();
			return data;
		}
			
			

		}


