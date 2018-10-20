package pruebitas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Escribir {
	
	private String folderOut;
	
	public Escribir(String path) {
		this.folderOut = path;
	}
	
	public void escribirOut(File fileIn) throws IOException {
		String nombreOut = fileIn.getName();
		
		System.out.println(nombreOut);
//		FileWriter fw = new FileWriter(this.folderOut + nombreOut);
//		PrintWriter pw = new PrintWriter(fw);
//		Scanner sc = new Scanner(fileIn);
//		
//		String datoIn = sc.nextLine();
//		
//		pw.println(datoIn + " procesado con exito");
//		pw.close();
//		fw.close();
//		sc.close();
	}
}
