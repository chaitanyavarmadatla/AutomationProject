package p1;

public class StringHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String first="Seleniumtraining";
		String second="Selenium";
		String third="training";
		System.out.println(first.length());
		System.out.println(first.charAt(3));
		System.out.println(first.substring(0, 5));
		System.out.println(first.indexOf("1"));
		System.out.println(first.concat("test"));
		System.out.println(first.contains("second"));
		System.out.println(first.endsWith("g"));
		System.out.println(first.equalsIgnoreCase("selenium Training"));
        System.out.println(second.equals("selenium"));
        System.out.println(second.indexOf("i",6));
        System.out.println(third.isEmpty()); // true or false
        System.out.println(first.lastIndexOf("i"));
        System.out.println(first.replace("T", "t"));
        //System.out.println(First.split("i"));
        System.out.println(first.trim());
        
        //split function
        
        String third1="Selenium Training day 2";
        String[] x = third1.split(" ");
        for(int i=0;i<x.length;i++)
        {
               System.out.println(x[i]);
        }
        

		
		

	}

}
