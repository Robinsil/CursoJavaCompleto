package curso_java_completo.arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Arquivos {
	public static void main(String[] args) {
		File file = new File("c:\\temp\\teste.txt");
		Scanner sc= null;
		try {
			sc = new Scanner(file);
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		}catch (IOException e) {
			System.out.println("Error"+e.getLocalizedMessage());
		}finally {
			if(sc != null) {
				sc.close();
			}
			
		}
	}

}
