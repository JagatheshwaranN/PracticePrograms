package dailyPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelDataType2 {

	public static void main(String ar[]) throws IOException {
		FileInputStream file = new FileInputStream(new File("E://ECLIPSE ENV//WorkSpace//JavaBasics//Files/Excel.xlsx"));

		String[] dataToWrite = { "Sarah", "Manager" };

		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("TestData2");
		int totalRows = sheet.getLastRowNum() - sheet.getFirstRowNum();
		Row row = sheet.getRow(0);
		Row newRow = sheet.createRow(totalRows + 1);

		for (int j = 0; j < row.getLastCellNum(); j++) {
			Cell cell = newRow.createCell(j);
			cell.setCellValue(dataToWrite[j]);
		}

		file.close();
		FileOutputStream fileOut = new FileOutputStream(new File("E://ECLIPSE ENV//WorkSpace//JavaBasics//Files/Excel.xlsx"));
		workBook.write(fileOut);
		fileOut.close();

		System.out.println("Done");
		WriteExcelDataType2.writeExcel();
	}

	public static void writeExcel() throws IOException {
		FileInputStream file = new FileInputStream(new File("E://ECLIPSE ENV//WorkSpace//JavaBasics//Files/Excel.xlsx"));
		String[] dataToWrite = { "Sarah", "Manager" };
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.createSheet("TestData3");
		int totalRows = 0;
		if (totalRows == 0) {
			sheet.createRow(0).createCell(0).setCellValue("Name");
			sheet.getRow(0).createCell(1).setCellValue("Designation");
		}

		totalRows = sheet.getLastRowNum() - sheet.getFirstRowNum();
		Row row = sheet.getRow(0);
		Row newRows = sheet.createRow(totalRows + 1);

		for (int j = 0; j < row.getLastCellNum(); j++) {
			Cell cell = newRows.createCell(j);
			cell.setCellValue(dataToWrite[j]);
		}

		System.out.println("Write Done");

		FileOutputStream fileOut = new FileOutputStream(new File("E://ECLIPSE ENV//WorkSpace//JavaBasics//Files/Excel.xlsx"));
		workBook.write(fileOut);
		fileOut.close();
	}

}
