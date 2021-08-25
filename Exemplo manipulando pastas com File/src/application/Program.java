package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		/*
		 * vai gerar uma lista das pastas que est�o no diret�rio digitado
		 */
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		/*
		 * vai gerar uma lista de arquivos, n�o pastas
		 */
		File[] files = path.listFiles(File::isFile);
		System.out.println();
		System.out.println("FILES:");
		for(File file : files) {
			System.out.println(file);
		}
		
		/*
		 * vai criar uma subpasta
		 */
		boolean success = new File(strPath + "\\subbdir").mkdir();
		System.out.println();
		System.out.println("Directory created successfully: " + success);
		
		sc.close();
	}

}
