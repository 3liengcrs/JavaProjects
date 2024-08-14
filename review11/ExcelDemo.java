package com.neotech.review11;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fullPath = System.getProperty("user.dir")+"/extra/Excel.xlsx";
		
		FileInputStream fis = new FileInputStream(fullPath);
		
		// read the whole excel file
		Workbook book = new XSSFWorkbook(fis);
		
		Sheet sheet = book.getSheet("Sheet1");
		
		Row row2 = sheet.getRow(2);
		Cell cell1 = row2.getCell(1);
		
		
		
		System.out.println(cell1.toString());
		
		// Let's get all the headers of the sheet and print them
				Row headerRow = sheet.getRow(0);

				// The n

				int cellNumber = headerRow.getLastCellNum();

				System.out.println("----------------------------------------------------");

				for (int i = 0; i < cellNumber; i++) {
					String cellData = headerRow.getCell(i).toString();
					System.out.print(cellData + " ");
				}

	}

}
