package p1;

public class SBI implements Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    SBI obj=new SBI();
    obj.withdraw(500);
	}
 int balance=1000;
	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		balance=balance-amount;
		System.out.println("remaining balance is "+balance);
		
	}

	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		balance=balance+amount;
		System.out.println("remaining balance is "+balance);
		
	}

}
