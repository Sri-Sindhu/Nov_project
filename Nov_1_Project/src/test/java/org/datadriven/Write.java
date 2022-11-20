package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {

	public static void main(String[] args) throws IOException {

		File a = new File("C:\\Users\\ELCOT\\Documents\\Write-Data-Driven.xlsx");
		
		FileInputStream s = new FileInputStream(a);

		Workbook d = new XSSFWorkbook(s);

		d.createSheet("Guru").createRow(0).createCell(0).setCellValue("Days");

		d.getSheet("Guru").getRow(0).createCell(1).setCellValue("Months");

		d.getSheet("Guru").createRow(1).createCell(0).setCellValue("Sunday");

		d.getSheet("Guru").getRow(1).createCell(1).setCellValue("April");

		d.getSheet("Guru").createRow(2).createCell(0).setCellValue("Monday");

		d.getSheet("Guru").getRow(2).createCell(1).setCellValue("March");

		FileOutputStream g = new FileOutputStream(a);
		d.write(g);

		d.close();

	}

}
