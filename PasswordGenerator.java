package password;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class PasswordGenerator 
{
	Random r = new Random();
	Scanner scan = new Scanner(System.in);
	static int password;
	int length = 8;
	String name;
	
	public void generation()
	{
		for(int i=0;i<length;i++)
		{
			password = r.nextInt(10);
			System.out.print(password);
		}
		System.out.println("\n");
	}
	
	public void username()
	{
		
		System.out.println("Enter your name: ");
		name = scan.next();
		int add = r.nextInt(1000);
		String usn = name.substring(0,5) + "" + add;
		System.out.println(usn);
	}
	
	public static void main(String[] args) 
	{
		PasswordGenerator pwd = new PasswordGenerator();
		System.out.println(pwd.length);
		pwd.generation();
		pwd.username();
		
	}

}
