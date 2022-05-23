package Secao5_EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1118 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int y = 1;
		double media;
		
		while (y == 1) {
			double a = sc.nextDouble();
				
		while(a<0 || a>10) {
			System.out.println("nota invalida");
			a = sc.nextDouble();
		}
			double b = sc.nextDouble();
		while(b<0 || b>10) {
			System.out.println("nota invalida");
			b = sc.nextDouble();
		}
		
		media = (a+b)/2;
		System.out.printf("media = %.2f\n", media);
		System.out.println("novo calculo (1-sim 2-nao)");
		int x = sc.nextInt();
		while (x != 1 && x != 2) {
			System.out.println("novo calculo (1-sim 2-nao)");
			x = sc.nextInt();
		}
		if (x == 1) {
			y = 1;
		}
		else {
			y = 0;
		}
		
		
		}
		sc.close();
		
		}
				
	}
