package util;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import base.TestBase;



public class Test01 extends TestBase{

	Workbook book;
	Sheet sheet;
	String sheetname;
	int row=0,cell=0;
	public Test01(String filepath,String sheetName) throws EncryptedDocumentException, IOException{
		this.sheetname = sheetName;
		FileInputStream fis = new FileInputStream(filepath);
		book = WorkbookFactory.create(fis);
		sheet = book.getSheet(sheetname);
	}
	
	public int getRow(){
		sheet = book.getSheet(sheetname);
		for(Row r : sheet){
			row++;
		}return row;
	}
	
	public int getCell(){
		sheet = book.getSheet(sheetname);
		for(Row r : sheet){
			for(Cell c : r){
				cell++;
			}break;
		}return cell;
	}
	
	public Object getValue(int x,int y){
		sheet = book.getSheet(sheetname);
		Row r = sheet.getRow(x);
		Cell c = r.getCell(y);
		String str = null;
		CellType type = c.getCellTypeEnum();
		
		if(type.equals(CellType.STRING)){
			str = c.getStringCellValue();
		}else if(type.equals(CellType.NUMERIC)){
			long l = (long) c.getNumericCellValue();
			str = String.valueOf(l);
		}
		Object obj;
		obj = str;
		return obj;
	}
	
	
}
