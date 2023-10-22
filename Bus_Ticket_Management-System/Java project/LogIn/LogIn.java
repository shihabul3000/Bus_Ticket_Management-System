package LogIn;
import Interfaces.ILogIn;
import java.util.Scanner;

import java.lang.*;
public class LogIn implements ILogIn
{
	public void welcome()
	{
		System.out.println();
		System.out.println("***SOPTOBODI TRAVELS***");
		System.out.println();
		
	}
	
	
	public void systemLogIn()
	{
		Scanner Enter=new Scanner(System.in);
		System.out.println("***Press Enter to continue***");
		Enter.nextLine();
		
	
	System.out.println();
	int count=0;
	while(count <= 1)
	{
	Scanner insert = new Scanner(System.in);
	String userName;
	String password;
	System.out.println("ENTER USERNAME:");
	userName=insert.next();
	System.out.println("ENTER PASSWORD:");
	password=insert.next();
	if("aatt".equals(userName) && "2208".equals(password))
	{
		System.out.println("IT IS SUCCESSFULLY LOGGED IN BY THE USER");
		System.out.println();
		
	}
	else
	{
		System.out.println("Invalid userName or password");
		System.exit(0);
	}
	count++;
	break;
	
	}
	}
}