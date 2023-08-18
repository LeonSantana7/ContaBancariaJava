package entidades;

public class BusinessAccount extends Account{
	private double loanLimite;

	public BusinessAccount() {
		super();
		
	}
	
	public BusinessAccount(Integer number, String holder, Double balance, double loanLimite) {
		super(number, holder, balance);
		this.loanLimite = loanLimite;
	}
	public double getLoanLimite() {
		return loanLimite;
	}
	public void setLoanLimite(double loanLimite) {
		this.loanLimite = loanLimite;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimite) {
			balance += amount - 10.0;
			
		}
	}
}
