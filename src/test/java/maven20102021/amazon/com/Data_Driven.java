package maven20102021.amazon.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven {

	public static void main(String[] args) throws Throwable {

		// File path
		File f = new File("C:\\Users\\intel\\eclipse-workspace\\amazon.com\\datadriven.xlsx");
		// Read the file
		FileInputStream read = new FileInputStream(f);
		// set the workbook
		Workbook wb = new XSSFWorkbook(read);
		// read from sheet
		Sheet sheet1 = wb.getSheetAt(0);

		// particular data based rows and columns
		Row row2 = sheet1.getRow(0);
		Cell cell2 = row2.getCell(0);
		System.out.println(sheet1.getRow(2).getCell(1));

		// getting row & column
		for (int i = 0; i < sheet1.getPhysicalNumberOfRows(); i++) {
			Row fullrow = sheet1.getRow(i);
			// System.out.println(fullrow);

			for (int j = 0; j < fullrow.getPhysicalNumberOfCells(); j++) {
				Cell fullcells = fullrow.getCell(j);
				CellType cellType = fullcells.getCellType();

				if (cellType.equals(cellType.STRING)) {
					String username = fullcells.getStringCellValue();
					System.out.println(username);
				}
				else if (cellType.equals(cellType.NUMERIC)) {
					double numeric = fullcells.getNumericCellValue();
					int value = (int) numeric;
					String password = String.valueOf(value);
					System.out.println(password);
				}
			}
		}
		
		//create new row & column and set cell value
		wb.getSheetAt(1).createRow(0).createCell(0).setCellValue("Login id");
		wb.getSheetAt(1).getRow(0).createCell(1).setCellValue("Password");
		wb.getSheetAt(1).getRow(0).createCell(2).setCellValue("Phone number");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		
	}

	
}
