package Secao4_EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		double x;

		if (a == 1) {
			x = b * 4;
		} 
		else if (a == 2) {
			x = b * 4.50;
		}
		else if (a == 3) {
			x = b * 5.00;
		} 
		else if (a == 4) {
			x = b * 2.00;
		} 
		else {
			x = b * 1.50;
		}
		
		System.out.printf("Total: R$ %.2f\n", x);

		sc.close();
	}

}
