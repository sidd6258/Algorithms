package bankaccounts;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class SavingsAccount extends BankAccounts {
	 private static final String TEXT ="I am a {0} account with {1,number,#} units of {2} currency";
	int units;
	String currency;
	
	public SavingsAccount(String currency,int units) {
		super();
		this.units = units;
		this.currency = currency;
	}
	
	
	@Override
	public int getUnits() {
		return this.units;
	}


	@Override
	public SavingsAccount getAccountType(){
		return this;
	}
	
	@Override
	public String getName(){
		return "Savings Account";
	}
	
	@Override
	public String getCurrency() {
		return this.currency;
	}


	public static void main(String args[] ) throws Exception {
        List<BankAccounts> accounts = new ArrayList<BankAccounts>();
        accounts.add(new SavingsAccount("USD",3));
        accounts.add(new SavingsAccount("EUR",2));
        accounts.add(new CheckingAccount("HUF",100));
        accounts.add(new CheckingAccount("COP",10000));
        accounts.stream().forEach(
                                    account -> System.out.println(
                                    MessageFormat.format(TEXT,
                                                new Object[]{
                                                account.getAccountType().getName(),
                                                account.getUnits(),
                                                account.getCurrency()
                                                        })));
    }

}
