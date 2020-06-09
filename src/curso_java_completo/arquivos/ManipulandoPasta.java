package curso_java_completo.arquivos;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPasta {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o caminho de uma pasta");
		
		String strpath = sc.nextLine();
		
		File path = new File(strpath);
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders");
		for(File folder:folders) {
			System.out.println(folder);
			
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files");
		for(File file:files) {
			System.out.println(file);
			
		}
		boolean success = new File(strpath +"\\subdir").mkdir();
		System.out.println("Diretorio criado com sucesso!"+success);
		
		
		sc.close();
		
	}

}
