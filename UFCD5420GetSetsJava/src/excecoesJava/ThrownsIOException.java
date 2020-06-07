package excecoesJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ThrownsIOException {
	


	public static void main(String[] args) throws IOException {
		File ficheiro = new File("Exemplo1.txt");
		ficheiro.createNewFile();
		FileWriter write = new FileWriter(ficheiro);
		write.write("escreve no ficheiro \n");
		write.write("CM\n");
		write.flush();
		write.close();
		
		
		
	

	}// fim void
	
	}// fim da class
