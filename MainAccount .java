
package practicemodule;
 class Account {
	protected String AccountNum;
	protected double balance;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(String accountNum) {
		super();
		AccountNum = accountNum;
		balance = 0;
	}

	public void deposit(double amt) {
		balance=balance+amt;
	}
	public void withdraw(double amt) {
		if(balance>amt)
		balance=balance-amt;
		else
			System.out.println("balance is less");
	}
	void details()
	{
		System.out.println("Account number:"+AccountNum);
		System.out.println("Balance is:"+balance);
		
	}
	

}
class SavingAccount extends Account {
	double intRate;
	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}
	public SavingAccount(String accountNum,double intRate) {
		super(accountNum);
		this.intRate = intRate;
	}
	public double addInterest()
	{
		double interest=balance*intRate;
		balance=balance+interest;
		return interest;
	}
	

}
 class LoanAccount extends Account{
	double LoanAmount;

	public LoanAccount(String accountNum, double loanAmount) {
		super(accountNum);
		LoanAmount = loanAmount;
		}
	
	public void  payEmi(double emi)
	{
		
		LoanAmount=LoanAmount-emi;
		System.out.println("successful");
	}
	
	}
 
 class HousingLoan extends LoanAccount{
	 int tenure;

	public HousingLoan(String accountNum, double loanAmount, int tenure) {
		super(accountNum, loanAmount);
		this.tenure = tenure;
	}

	public void extendTenure(int yr)
	{
	tenure=tenure+yr;
	System.out.println("Tenure extended by"+yr+"years");
		
	}
	 
 }
 


public class MainAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sa=new SavingAccount("SBI2001", 0.05);
//		sa.details();
		sa.deposit(5000);
		sa.details();
		System.out.println("--------------------------------");
//		sa.addInterest();
//		sa.details();
		HousingLoan ha=new HousingLoan("HL2027", 60000, 10);
		ha.deposit(15000);
		ha.payEmi(5000);
		ha.details();
		


	}

}
