package p1;

public class NestedLoopExampleForPrintPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=6;
		int i,j;
		for (i=1;i<=num;i++)
	    {
		 for(j=1;j<=i;j++)
		{
			System.out.print(j);
		}
	   
	       System.out.println("");
	    }
  }

}