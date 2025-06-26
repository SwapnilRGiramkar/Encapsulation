//Encapsulation Bank Program Realtime example
package encapsulation;

public class Bank {
	
	private String bank;
	private long mob;
	private int balance;
	private long adhar;
	private long acc;
	
	public Bank() {
		// TODO Auto-generated constructor stub
	}
	Bank(String bank,String branch,long mob,int balance,long adhar,long acc)
	{
		this.bank=bank;
		this.balance=balance;
	}
	
	public String getBank()
	{
		return bank;
	}
	public void setMobile(long mob)
	{
		this.mob=mob;
	}
	public void setAdhar(long adhar)
	{
		this.adhar=adhar;
	}
	public void setAcc(long acc)
	{
		this.acc=acc;
	}
	public long getAdhar()
	{
		return adhar;
	}
	public long getAcc()
	{
		return acc;
	}
	public void setBal(int balance)
	{
		this.balance=balance;
	}
	public long getBal()
	{
		return balance;
	}
	public long getMobile() {
		// TODO Auto-generated method stub
		return mob;
	}

}
//-----------------------------------------------------------------------
package encapsulation;

public class BankDriver 
{
	public static void main(String[] args) {
		Bank b1=new Bank();
		b1.setMobile(9284094059l);
		System.out.println("Mobile : "+b1.getMobile());
		
		b1.setAdhar(658228890126l);
		System.out.println("Adhar Card : "+b1.getAdhar());
		
		b1.setBal(3000);
		System.out.println("Balance : "+b1.getBal());
	}

}
//---------------------------------------------------------------------------
