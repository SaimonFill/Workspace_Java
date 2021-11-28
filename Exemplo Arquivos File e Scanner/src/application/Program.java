package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\saimo\\Desktop\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			/*
			 * o bloco while vai testar se ainda existe uma nova linha no arquivo e imprimir na tela
			 */
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if(sc != null) {
			sc.close();
			}
		}		
	}
}
