package br.com.welliton.readxls;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import br.com.welliton.Bean.Produto;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Read {

	public String Category;

	public void openFile(File file) {
		try {
			FileInputStream fisPlanilha = new FileInputStream(file);
			Produto produto;
			// buscando toda a planilha
			XSSFWorkbook workbook = new XSSFWorkbook(fisPlanilha);

			Sheet sheet = workbook.getSheetAt(0);
			int rowsCount = sheet.getLastRowNum();

			System.out.println("Total Number of Rows: " + (rowsCount + 1));
			Iterator<Row> rowIterator = sheet.iterator();
			 int i=0;
	            while (rowIterator.hasNext()) {
	            	Row row = rowIterator.next();
	            	produto = new Produto();
	                Iterator<Cell> cellIterator = row.cellIterator();
		            while(cellIterator.hasNext()) {
		            	 Cell cell = cellIterator.next();
		            	 
		            	switch (cell.getColumnIndex()) {
						case 0:
							if(cell.getCellType()==0) {
								//System.out.println(cell.getNumericCellValue());
							
								produto.setId(  (int)  cell.getNumericCellValue());
							}else {
								//System.out.println(cell.getStringCellValue());
								
							}
							break;
						case 1:
							if(cell.getCellType()==0) {
								//System.out.println(cell.getNumericCellValue());
								
							}else {
								//System.out.println(cell.getStringCellValue());
								produto.setNome(cell.getStringCellValue());
							}
							break;
						case 2:
							if(cell.getCellType()==0) {
								//System.out.println(cell.getNumericCellValue());
								produto.setFree_shipping((int)cell.getNumericCellValue());
							}else {
								//System.out.println(cell.getStringCellValue());
							}
							break;
						case 3:
							if(cell.getCellType()==0) {
								System.out.println(cell.getNumericCellValue());
							}else {
								//System.out.println(cell.getStringCellValue());
								produto.setDescricao(cell.getStringCellValue());
							}
							break;
						case 4:
							if(cell.getCellType()==0) {
								System.out.println("Valor produt = " + cell.getNumericCellValue());
								//produto.setValor(cell.getNumericCellValue());
							}else {
								if(!cell.getStringCellValue().equals("price")) {
									produto.setValor(Double.parseDouble(cell.getStringCellValue()));
								}
							}
							break;
						default:
							break;
				
						}
		            	
		           
		            	
		            }
		            i++;
		         	System.out.println(produto);
	                
	            }

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
