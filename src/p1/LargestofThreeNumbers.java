package p1;

public class LargestofThreeNumbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=15;
		int y=20;
		int z=25;
		if(x>z && x>y)
		{ 
		   System.out.println("x is the greatest");
		}
		else if(y>z && y>x)
		{
		   System.out.println("y is the greatest");
		}
		else
		{
			System.out.println("z is the greatest");
		}
	}

	
}


