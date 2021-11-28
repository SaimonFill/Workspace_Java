package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);
		
		/*
		 * UPCASTING:
		 * Pegar um objeto da classe BusinessAccount e atribuílo para
		 * uma variável do tipo Account
		 */
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		/*
		 * DOWNCASTING
		 * Converter um objeto da superclasse para a subclasse
		 */
		
		BusinessAccount acc4 = (BusinessAccount)acc2;//está forçando um downcasting
		acc4.loan(100.0);
		
		/*
		 * não é permitido fazer o downcasting pq acc3 é do tipo SavingsAccount, então é uma
		 * Account e não BusinessAccount		
		 */
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		
		/*
		 * Exemplo para testar a condição acima:		
		 */
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}

	}

}
