package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	static Logger log = Logger.getLogger(Write_Data.class);

	public static void Write( String si) throws IOException {

		File a = new File("C:\\Users\\ELCOT\\Documents\\Write-Data-Driven.xlsx");
		FileInputStream s = new FileInputStream(a);

		Workbook d = new XSSFWorkbook(s);

		d.createSheet(si).createRow(0).createCell(0).setCellValue("Days");

		d.getSheet(si).getRow(0).createCell(1).setCellValue("Months");

		d.getSheet(si).createRow(1).createCell(0).setCellValue("Sunday");

		d.getSheet(si).getRow(1).createCell(1).setCellValue("April");

		d.getSheet(si).createRow(2).createCell(0).setCellValue("Monday");

		d.getSheet(si).getRow(2).createCell(1).setCellValue("March");

		FileOutputStream g = new FileOutputStream(a);
		d.write(g);

		d.close();

		log.info("Done");
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		Write("A_Sheet");

	}
}
