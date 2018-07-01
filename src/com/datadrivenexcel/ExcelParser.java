package com.datadrivenexcel;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelParser {

	private String filePath;
	private String[][] dataBasket;

	public ExcelParser(String p_filePath) {
		this.filePath = p_filePath;
	}

	public String[][] retrieveData() throws BiffException, IOException {
		File myExcelFile = new File(filePath);
		Workbook objWork = Workbook.getWorkbook(myExcelFile);
		Sheet objSheet = objWork.getSheet(0);
		int cols = objSheet.getColumns();
		int rows = objSheet.getRows();
		String[][] parameterArray = new String[cols][rows];
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				Cell objCell = objSheet.getCell(col, row);
				parameterArray[col][row] = objCell.getContents();
			}
		}
		return parameterArray;
	}
}
