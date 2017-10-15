package bankaccounts;

public class CheckingAccount extends BankAccounts {
	int units;
	String currency;
	
    public CheckingAccount(String currency,int units) {
		super();
		this.units = units;
		this.currency = currency;
	}
	
	@Override
	public int getUnits() {
		// TODO Auto-generated method stub
		return this.units;
	}
	@Override
	public String getCurrency() {
		// TODO Auto-generated method stub
		return this.currency;
	}
	@Override
	public BankAccounts getAccountType() {
		// TODO Auto-generated method stub
		return this;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Checkings Account";
	}
	
	

}
