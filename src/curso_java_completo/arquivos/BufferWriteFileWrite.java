package curso_java_completo.arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriteFileWrite {
	public static void main(String[] ags) {
		
		String[] lines = new String[]{
				"Curso completo de JAVA",
				"FileWriter manipulando arquivos"
		};
		String path ="c:\\temp\\out.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
			for(String line:lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
