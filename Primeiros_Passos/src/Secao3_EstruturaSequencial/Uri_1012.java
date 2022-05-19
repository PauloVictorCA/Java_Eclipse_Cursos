package Secao3_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1012 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			double A = sc.nextDouble();
			double B = sc.nextDouble();
			double C = sc.nextDouble();
			double pi = 3.14159;
						
			double a = (A*C)/2;
			double b = Math.pow(C, 2)*pi;
			double c = ((A + B) * C)/2;
			double d = Math.pow(B, 2);
			double e = A * B;
			
			System.out.printf("TRIANGULO: %.3f\n", a);
			System.out.printf("CIRCULO: %.3f\n", b);
			System.out.printf("TRAPEZIO: %.3f\n", c);
			System.out.printf("QUADRADO: %.3f\n", d);
			System.out.printf("RETANGULO: %.3f\n", e);
			
		
		sc.close();
	}

}

