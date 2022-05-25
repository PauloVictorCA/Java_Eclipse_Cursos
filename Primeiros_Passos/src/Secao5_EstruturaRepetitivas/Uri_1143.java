package Secao5_EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1143 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		int x = 1, y = 1, z = 1;
		Double w = Math.sqrt(25);
		while(p<1 || p>1000) {
			System.out.println("Valor invalido");
			p = sc.nextInt();
		}
		
		for(int i=1;i<=p;i++) {
			System.out.println(x + " " + y + " " + z);
			x ++;
			y = x*x;
			z = x * y;
		}
		
		sc.close();
		}
				
	}
