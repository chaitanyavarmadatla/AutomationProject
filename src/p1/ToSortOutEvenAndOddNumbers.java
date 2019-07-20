package p1;

public class ToSortOutEvenAndOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int oddCounter=0;
	    int evenCounter=0;
		int[] empAge= {10,20,25,40,23,24,45,56,64,32,19};
		int arrLength=empAge.length;
		for(int i=0;i<arrLength;i++)
		{
	        if(empAge[i]%2==0)
		{ 
			evenCounter++;
		}
		else
		{
			oddCounter++;
		}

	}
		
		System.out.println("ëven count is "+evenCounter);
		System.out.println("odd count is "+oddCounter);	

	}

}
