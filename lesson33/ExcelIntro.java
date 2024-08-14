package com.neotech.lesson33;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntro {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// let get the location of our local EXEL file
		String filePath = System.getProperty("user.dir")+
				"/test_data/Test.xlsx";
		//
		Workbook book = new XSSFWorkbook(filePath);
		
		//create a sheet object
		
		Sheet testData = book.getSheet("TestData");
		
		
		// Access certain object
		Row firstRow = testData.getRow(0);
//		System.out.println(firstRow.);
		
		
		// lets create a certain cell within the row 
		
		Cell cell = firstRow.getCell(1);
		
		String infoInCell = cell.toString();
		
		System.out.println(infoInCell);
		
		
		// how do i get NY?
				Row rowNy = testData.getRow(2);
				Cell nyCell = rowNy.getCell(3);
				String cellValue = nyCell.toString();
				System.out.println(cellValue);
				System.out.println(nyCell);

				// lets get Garfield using method chaining
				String cellValue2 = testData.getRow(1).getCell(2).toString();
				System.out.println(cellValue2);

				// how do i get a numeric value from the cell?
				double cellDoubleValue = testData.getRow(1).getCell(4).getNumericCellValue();
				System.out.println(cellDoubleValue);

				// we can convert it into an integer
				int intValue = (int) cellDoubleValue;
				System.out.println(intValue);

	}

}
