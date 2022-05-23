package Secao5_EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1117 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, media;
		
		a = sc.nextDouble();
		
		while (a<=0 || a>10) {
			System.out.println("nota invalida");
			a = sc.nextDouble();
		}
		
		b = sc.nextDouble();
		while (b<=0 || b>10) {
			System.out.println("nota invalida");
			b = sc.nextDouble();
		}
		
		media = (a + b)/2;
		
		System.out.printf("media = %.2f\n", media);
		
		sc.close();
	}

}
