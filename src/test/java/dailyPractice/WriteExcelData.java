package dailyPractice;
import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData {

	public static void main(String ar[]) {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("TestData");

		Map<String, Object[]> dataMap = new TreeMap<String, Object[]>();
		
		dataMap.put("1", new Object[] { "Name", "Position" });
		dataMap.put("2", new Object[] { "Jaga", "Tester" });
		dataMap.put("3", new Object[] { "Arul", "Developer" });

		Set<String> keyVal = dataMap.keySet();

		int rownum = 0;
		
		for (String key : keyVal) {
			
			Row row = sheet.createRow(rownum++);
			
			Object[] dataArray = dataMap.get(key);

			int cellnum = 0;

			for (Object data : dataArray) {
				
				Cell cell = row.createCell(cellnum++);
				
				if (data instanceof String) {
					cell.setCellValue((String) data);
				}
				if (data instanceof Integer) {
					cell.setCellValue((Integer) data);
				}

			}
		}

		try {

			FileOutputStream file = new FileOutputStream(
					new File("E://ECLIPSE ENV//WorkSpace//JavaBasics//Files/Excel.xlsx"));
			workbook.write(file);
			file.close();
			System.out.println("Data written into Excel");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
