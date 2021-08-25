import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int room;
		String name, email;
		Rent[] rent = new Rent[10];
		
		System.out.println("How many rooms will be rented?");
		int quantidadeQuartos = sc.nextInt();
		
		for(int i = 1; i <= quantidadeQuartos; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Room: ");
			room = sc.nextInt();
			
			//testa se o quarto escolhido esta ocupado, se estiver pede para tentar novamente
			if(rent[room] != null) {
				System.out.println();
				System.out.println("Occuped, free rooms:");
				for(int y = 0; y < rent.length; y++) {
					if(rent[y] == null) {
						System.out.print(y + ", ");
					}
				}
				System.out.println();
				System.out.println("Try again: ");
				room = sc.nextInt();
				rent[room] = new Rent(name, email); //cria um objeto
				
			}else {
				rent[room] = new Rent(name, email); //cria um objeto
			}
		}
		
		//lista os quartos reservados
		System.out.println();
		System.out.println("Buse rooms:");
		for(int i = 0; i < 10; i++) {
			if(rent[i] != null) {
				System.out.println(i + ": " + rent[i].toString());
			}
		}		
		
		
		sc.close();
	}

}
