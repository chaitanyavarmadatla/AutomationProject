package p1;

public class FactorialOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int number=5;
    int fact =1;
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
	    }
		System.out.println("factorial is " +fact);
		}
}
