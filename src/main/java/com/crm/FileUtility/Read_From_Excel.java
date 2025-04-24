package com.crm.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_From_Excel {
	public static String readExcel(String sh, int row, int col) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\Aniket Sandbhor\\eclipse-workspace2\\com.crm.OrangeHRM\\src\\test\\resources\\UserDataExcel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sh);
		String data = sheet.getRow(row).getCell(col).toString();
		return data;
	}
	
}
