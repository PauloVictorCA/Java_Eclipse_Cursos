package Secao3_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1011 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			double pi = 3.14159;
			double r = sc.nextDouble();
			
			double resp = (4.0/3.0) * pi * Math.pow(r, 3);
			
			System.out.printf("VOLUME = %.3f\n", resp);
		
		
		sc.close();
	}

}
