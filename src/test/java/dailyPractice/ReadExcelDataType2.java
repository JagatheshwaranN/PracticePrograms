package dailyPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDataType2 {

	public static void main(String ar[]) throws IOException {
		FileInputStream file = new FileInputStream(new File("E://ECLIPSE ENV//WorkSpace//JavaBasics//Files/Excel.xlsx"));

		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("TestData2");
		int rowsCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		System.out.println("rowsCount " + rowsCount);
		for (int i = 0; i < rowsCount + 1; i++) {
			Row row = sheet.getRow(i);

			for (int j = 0; j < row.getLastCellNum(); j++) {
				System.out.print(row.getCell(j).getStringCellValue() + " ");
			}
			System.out.println();
		}

	}

}
