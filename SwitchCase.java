package NewTraningSessesionJava;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		String operation;
		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value A = ");
		
		a=sc.nextInt();
		System.out.println("Enter the value B=");
		
		b=sc.nextInt();
		System.out.println("Enter the operation =");
		
		 operation = sc. next();
		switch(operation)
		{
		case "Add":
			c = a+b;
			System.out.println("Addition ="+ c);
		break;
		case  "Sub":
		c = a-b;
		System.out.println("subtraction = "+ c);
		
		}
		}
		
	}

}
