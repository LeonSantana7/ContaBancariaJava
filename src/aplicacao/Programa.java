package aplicacao;

import entidades.Account;
import entidades.BusinessAccount;
import entidades.SavingsAccount;

public class Programa {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
	
		//UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "João", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Pedro", 0.0, 0.01);
	}
	
}
