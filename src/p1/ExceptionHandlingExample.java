package p1;

import java.io.FileNotFoundException;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    int z=10;
	try
	{
	ValidateFilePath("d:\\mef");
	int[] arr1= {10,20,30,40};
	System.out.println(arr1[4]);
	int x=10;
	int y=0;
	z=x/y;
	}
	
	catch(ArithmeticException e)
	{
		System.out.println("Divide by Zero Exception caught" +e.getMessage());	
	}
	
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Array Index Exception caught " +e.getMessage());	
	}
	catch(Exception e)
	{
		System.out.println("Exception caught " +e.getMessage());	
	}
	
	System.out.println("value of z is "+z);
    System.out.println("hello");
	
   }


//Throw Exception
public static void ValidateFilePath(String filePath) throws FileNotFoundException
{
	if(!filePath.contains("C:"))
	{
		throw new FileNotFoundException("Path must belong to C drive");
	}
 }
}
