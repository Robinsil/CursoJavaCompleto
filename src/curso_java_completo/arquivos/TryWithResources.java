package curso_java_completo.arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
	public static void main(String[] args) {
	String path = "c:\\temp\\teste.txt";

	try(
	BufferedReader br = new BufferedReader(new FileReader(path)))
	{

		String line = br.readLine();

		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}

	}catch(
	IOException e)
	{
		System.out.println("Erro ao ler arquivo" + e.getMessage());
	}
  }
}
