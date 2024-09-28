package NewTraningSessesionJava;

public class ResultofStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks = 67;
		int fail = 35;
		int pass = 50;
		int secondclass = 60;
		int distiction = 80;
		
		if(marks<35)
		{
			System.out.println("Student is failed");	
		}
		
		else if (marks>=35 && marks<50) {	
			System.out.println("Student is passed");
		}
		else if (marks>=60 && marks<60)		
		{
			System.out.println("student is passed with First  class ");	
	}
	else if (marks>=60 && marks<75)
	{
		System.out.println("student is passed with first class");
	}
	
	else if(marks>=75)	
	{
		System.out.println("student is passed with distinction");
	}
		
		

	}

}
