package NewTraningSessesionJava;

import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args) {
		double r ;
        double pi = 3.14;
        double area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius : ");
        r = sc.nextDouble();

        area = pi * r * r;

        System.out.println("area="+area);

	}

}
