package bankaccounts;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static final String TEXT ="I am a {0} account with {1,number,#} units of {2} currency";
    
    
    abstract class BankAccount { 
        abstract public int getUnits();
        abstract public String getCurrency();
        abstract public BankAccount getAccountType();
        abstract public String getName(); 
    }
    
    class SavingsAccount extends BankAccount {
        int units;
        String currency;
        public SavingsAccount(String currency,int units ) {
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
            return "Savings";
        }
        @Override
        public String getCurrency() {
            return this.currency;
        }
    }
    
    class CheckingAccount extends BankAccount {
        int units;
        String currency;

        public CheckingAccount(String currency,int units ) {
            super();
            this.units = units;
            this.currency = currency;
        }

        @Override
        public int getUnits() {
            return this.units;
        }
        @Override
        public String getCurrency() {
            return this.currency;
        }
        @Override
        public CheckingAccount getAccountType() {
            return this;
        }
        @Override
        public String getName() {
            return "Checking";
        }
    }
    class BrokerageAccount extends BankAccount {
        int units;
        String currency;

        public BrokerageAccount(String currency,int units ) {
            super();
            this.units = units;
            this.currency = currency;
        }

        @Override
        public int getUnits() {
            return this.units;
        }
        @Override
        public String getCurrency() {
            return this.currency;
        }
        @Override
        public BrokerageAccount getAccountType() {
            return this;
        }
        @Override
        public String getName() {
            return "Brokerage";
        }
    }
    
    public static void main(String args[] ) throws Exception {
    	
        List<BankAccount> accounts = new ArrayList<BankAccount>();
        Solution sol=new Solution();
        accounts.add(sol.new SavingsAccount("USD",3));
        accounts.add(sol.new SavingsAccount("EUR",2));
        accounts.add(sol.new CheckingAccount("HUF",100));
        accounts.add(sol.new CheckingAccount("COP",10000));
        accounts.add(sol.new BrokerageAccount("GBP",2));
        accounts.add(sol.new BrokerageAccount("INR",600));
        
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