package p1;

public class AverageAgeOfAnEmployeeUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[5];
		int sumAge=0;
	    int[] empAge={10,20,30,40,23,24,45,56,64,32,19};
        for(int i=0;i<empAge.length;i++)
        {
        	sumAge=sumAge+empAge[i];
        }
        int avgAge=sumAge/empAge.length;
        System.out.println(avgAge);

	}

}
