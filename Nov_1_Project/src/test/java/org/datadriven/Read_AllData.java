package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_AllData {
	
	public static void All_Data()throws IOException {
		
		File a = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Break_Project\\Nov_1_Project\\Read-DataDriven.xlsx");

		FileInputStream s = new FileInputStream(a);

		Workbook d = new XSSFWorkbook(s);

		Sheet f = d.getSheetAt(0);

		for (int i = 0; i <f.getPhysicalNumberOfRows(); i++) {
			Row g = f.getRow(i);
			
			for (int j = 0; j<g.getPhysicalNumberOfCells(); j++) {
				
			Cell h = g.getCell(j);

			CellType k = h.getCellType();

			if (k.equals(CellType.STRING)) {
			} else if (k.equals(CellType.NUMERIC)) {
			}

			if (k.equals(CellType.STRING)) {
				String value = h.getStringCellValue();
				System.out.println(value);
			} else if (k.equals(CellType.NUMERIC)) {
				double z = h.getNumericCellValue();
				int q = (int) z;
				String valueOf = String.valueOf(q);
				System.out.println(valueOf);
			}

			d.close();
		}
	}
	}
	public static void main(String[] args) throws IOException {
		All_Data();
	}

	}


