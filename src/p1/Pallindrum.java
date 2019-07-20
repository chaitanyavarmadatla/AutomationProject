package p1;

public class Pallindrum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test="madamf";
		boolean matches=true;
		
		//1st way for Pallindrum check
		
		StringBuffer sbf=new StringBuffer(test);
		String testReserve=sbf.reverse().toString();
		if(test.equals(testReserve))
		{
			System.out.println("String is Pallindrum");
		}
		else
		{
			System.out.println("String is not a Pallindrum");	
		}
		
				
		//Second way for Pallindrum check
	    for(int i=0;i<test.length()/2;i++)	
			
		{
			if(test.charAt(i)==test.charAt(test.length()-(i+1)))
			{
				
			}
			else
			{
				matches=false;
				break;
			}
			
		if(matches=true)
			
		    {
			System.out.println("String is Pallindrum");
		    }
		    else
		   {
			System.out.println("String is not a Pallindrum");	
		   }
	   }
   }
}
		

	


