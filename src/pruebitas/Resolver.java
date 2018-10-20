package pruebitas;

import java.io.File;
import java.io.IOException;
import org.junit.Test;

public class Resolver {
	
	@Test
	public void escribirTodasLasSalidas() throws IOException {
		Leer lector = new Leer("Entradas/");
		File[] listaFiles = lector.abrirArchivosIn();
		
		Escribir escritor = new Escribir("Salidas/");
		
		for (File file : listaFiles) {
			if(file.getName().endsWith(".in"))
				escritor.escribirOut(file);
		}
	}
}
