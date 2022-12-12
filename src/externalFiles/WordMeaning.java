package externalFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WordMeaning {
	
	public static void main(String[] args) throws IOException, FileNotFoundException, NullPointerException  {
		String path = "data\\dictionary.xlsx";
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fi);
		try {
		int n=4;
		for(int i=0; i<n; i++) {
				for(int j=1;j<n;j++) {
					System.out.println(wb.getSheetAt(0).getRow(i+1).getCell(j));
					}
				System.out.println("\n");
				}
		}catch(Exception e) {
			System.out.println("Something went wrong");
		}	
	}
}