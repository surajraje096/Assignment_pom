package util;

import java.io.IOException;
import java.util.Hashtable;

import org.apache.poi.EncryptedDocumentException;

import base.TestBase;






public class ExcelReader extends TestBase{

	public Object[][] getData(String sheetname) throws EncryptedDocumentException, IOException{
		
		Test01 t = new Test01("D:\\SpringBoot API Projects\\Assin_Google_S_POM\\src\\com\\google\\config\\Book1.xlsx",sheetname);
		int row = t.getRow();
		System.out.println("row is:" +row);
		int cell = t.getCell();
		System.out.println("cell is:" +cell);
		
		Object[][] data = new Object[row-1][1];
		Hashtable<Object,Object> table = new Hashtable<Object,Object>();
		for(int i=0;i<row-1;i++){
		
			for(int j=0;j<cell;j++){
				table.put(t.getValue(0, j), t.getValue(i+1, j));
				data[i][0] = table;
			}
		}return data;
	}

	
}
