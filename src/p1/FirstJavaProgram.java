
package p1;
public class FirstJavaProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Hello");
    B obj2 = new B();
    int sum2 = obj2.add(4, 5);
    int mul=obj2.multiply(4,5);
    System.out.println(sum2);
    System.out.println(mul);
    
	}

}

class A {
	
	public int x=5;
	protected int y=5;
	int z=7;
	private int spread =3;
	public int getExchangeRate()
	{
		return 70+spread;
		
	}
	
	int add(int a,int b)
	{
		return a+b;
	}
	double add(double a,double b)
	{
		return a+b;
}
	}

class B extends A
{
	int multiply(int a,int b)
	{
		return a*b;
}
}
