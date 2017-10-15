package bankaccounts;

abstract class BankAccounts { 
	abstract public int getUnits();
	abstract public String getCurrency();
	abstract public BankAccounts  getAccountType();
	abstract public String getName(); 
}
