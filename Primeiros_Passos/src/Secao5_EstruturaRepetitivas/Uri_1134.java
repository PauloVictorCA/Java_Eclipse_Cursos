package Secao5_EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1134 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int cont1 = 0, cont2 = 0, cont3 = 0;
		
		
		while (a!=4) {
			
			if(a == 1) {
				cont1 += 1;
			}
			if(a == 2) {
				cont2 += 1;
			}
			if(a == 3) {
				cont3 += 1;
			}
			a = sc.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + cont1);
		System.out.println("Gasolina: " + cont2);
		System.out.println("Diesel: " + cont3);
		
		sc.close();
	}

}

