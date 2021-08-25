package entities;

public class SavingsAccount extends Account{
	
	private Double interestRate;
	
	public SavingsAccount () {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRAte) {
		super(number, holder, balance);
		this.interestRate = interestRAte;
	}

	public Double getInterestRAte() {
		return interestRate;
	}

	public void setInterestRAte(Double interestRAte) {
		this.interestRate = interestRAte;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
}
