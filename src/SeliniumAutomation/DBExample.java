package SeliniumAutomation;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DBExample {

	public static void main(String[] args) {
	try{
		
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/test","root","");
	//here test is database name, root is username and password
	
	Statement stmt=(Statement) con.createStatement();
	String sUpdateQuery="update admin set password='admin' where username='admin'";
    int val=((java.sql.Statement) stmt).executeUpdate(sUpdateQuery);
	if(val==1)
	{
		System.out.println("update is successful");
	}
	else
	{
		System.out.println("update is not successful");
	}
	
		// TODO Auto-generated method stub

	ResultSet rs=((java.sql.Statement) stmt).executeQuery("select * from admin");
	while(rs.next())
	System.out.println(rs.getObject(1) +" "+rs.getString(2)+" "+rs.getString(3));
	con.close();
	}catch (Exception e) {System.out.println(e);}
	}

}
