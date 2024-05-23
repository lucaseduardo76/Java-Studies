package testeFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CriandoArquivo {
	public static void main(String[] args) {

		String[] lines = new String[] {"Primeira linha", "Segunda linha", "Terceira linha"};
		String path = "c:\\temp\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
}
