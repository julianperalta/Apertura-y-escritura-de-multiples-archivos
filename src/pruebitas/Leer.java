package pruebitas;

import java.io.File;

public class Leer {
	
	private String folderIn;
	
	public Leer(String path) {
		this.folderIn = path;
	}
	
	public File[] abrirArchivosIn() {
		File folder = new File(this.folderIn);
		File[] listaFiles = folder.listFiles();
		
		return listaFiles;
	}
}
