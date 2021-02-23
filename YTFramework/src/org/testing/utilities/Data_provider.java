package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class Data_provider 
{
	public Object[][] dp() throws BiffException, IOException
	{
		File f = new File("C:\\Users\\admin\\Desktop\\input.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet  ws = wk.getSheet(0);
		int r = ws.getRows();
		int c = ws.getColumns();
		
		Object [][] obj = new Object[r][c];
		
		for(int i = 0; i < r; i++)
		{
			for (int j = 0 ; j < c ; j++)
			{
				Cell c1 = ws.getCell(j, i);
				obj[i][j]	=c1.getContents();
			}
		}
	return obj;
	}

}
