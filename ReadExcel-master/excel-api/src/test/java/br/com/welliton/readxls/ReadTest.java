package br.com.welliton.readxls;

import java.io.File;

import org.junit.Test;

public class ReadTest {
	
	@Test
	public void testReadFile() {
		Read read = new Read();
		File file = new File("C:\\file\\fotos\\EsteArquivo.xlsx");
		
		read.openFile(file);
	}

}
