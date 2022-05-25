package Secao5_EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Aula_54 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char y;		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double a = sc.nextDouble();
			double b = (9*a/5)+32;
			System.out.printf("Equivalente em Fahrenheit: %.1f\n", b);
			System.out.print("Deseja repetir (s/n)? ");
			y = sc.next().charAt(0);
				while(y!='n' && y!='s') {
					System.out.print("Deseja repetir (s/n)? ");	
					y = sc.next().charAt(0);
				}
							
		}	while(y=='s');
			
		sc.close();
		}
				
	}

