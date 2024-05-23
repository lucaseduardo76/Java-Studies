package testeFiles;

import java.io.File;
import java.util.Scanner;

public class CriandoPastas_Visualizandoitem {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		// Pegando todas as subpastas dessa pasta
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders: ");
		
		for(File folder : folders) {
			System.out.println("folder");
		}
		
		//pegando todos os arquivos de uma pasta
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files: ");
		for(File file: files) {
			System.out.println(file);
		}
		
		//Criando uma nova pasta
		boolean success = new File(strPath + "\\novaPasta").mkdir();
		System.out.println("Pasta criada com sucesso: " + success);
		sc.close();
		
	}
}
