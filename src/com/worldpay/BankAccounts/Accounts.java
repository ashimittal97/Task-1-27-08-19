package com.worldpay.BankAccounts;

public class Accounts {
	int accno, balance;
	String accHolderName, accType;
	static int totalDeposists, totalWithdrawls;

	// method for initializing
	void setDetails(int ano, int bal, String name, String actype) {
		accno = ano;
		balance = bal;
		accHolderName = name;
		accType = actype;

	}

	// method for showing details of account

	public  static void showDetails(Accounts acc){
		System.out.println("Account number is "+acc.accno);
		System.out.println("Account Holder name is "+acc.accHolderName);
		System.out.println("Account Balance  "+acc.balance);
		System.out.println("Account Type is "+acc.accType);
		System.out.println("--------------------------------------------------------");
	}
	// method for withdrawal of amount 
	public void withdrawal(int amount){
		if(balance>amount){
			balance=balance-amount;

			System.out.println("Please Collect your cash...!");
			System.out.println("Amount Left "+balance);
			System.out.println("=====================================================");
			totalWithdrawls++;
		}
		else{
			System.out.println("Insufficient Balance ");
		}
		
	}
	//method for depositing amount in account
	public void deposit(int amount){
		balance=balance+amount;
		System.out.println("You account balance is now :"+balance);
		System.out.println("=====================================================");
		totalDeposists++;
	}
	
	//method for displaying totaldeposists and total withdrawals
	public static void total(){
		System.out.println("Total Withdrawals :"+totalWithdrawls);
		System.out.println("Total  deposists :"+totalDeposists);
		System.out.println("=====================================================");
	}
	
	//method for computing average balance of n accounts 
	public void balAvg(Accounts...ac){
       int total=0;
		
		for(Accounts s:ac){
			total=total+s.balance;
		}
		System.out.println("AVG BALANCE : "+(total/ac.length));
		System.out.println("=====================================================");
	}
   //CONSTRUCTOR
	public Accounts(int acno,int bal,String name,String actype){
		accno=acno;
		balance=bal;
		accHolderName=name;
		accType=actype;
		
	}
	Accounts(){
		
	}
	public static void main(String[] args) {
		Accounts a1 = new Accounts();
		Accounts a2 = new Accounts();
		Accounts a3 = new Accounts();
	Accounts a4 = new Accounts(121212,20000,"xyz","current");
	Accounts a5 = new Accounts(131313,10000,"zzz","saving");
	Accounts a6 = new Accounts(141414,60000,"uuu","current");
	Accounts a7 = new Accounts(151515,20000,"ppp","current");
		a1.setDetails(100100100, 50000, "abc", "Saving");
		a2.setDetails(100200200, 35000, "efg", "Current");
		a3.setDetails(100300300, 79000, "mno", "Saving");
		
		Accounts.showDetails(a1);
		Accounts.showDetails(a2);
		Accounts.showDetails(a3);
		
		
		a1.withdrawal(20000);
		a3.withdrawal(10000);
		
		
		a2.deposit(15000);
		a3.deposit(10000);
		a4.deposit(1000);
		a1.deposit(3000);
		
		Accounts.total();
	}

}
