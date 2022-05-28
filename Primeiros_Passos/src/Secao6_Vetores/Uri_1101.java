package Secao6_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1101 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max, min, soma = 0;
		while(a>0 && b>0) {
		if(a>b) {
			max = a;
			min = b;
		}
		else {
			max = b;
			min = a;
		}
		int x=min;
			
			while(x<=max) {
				System.out.print(x + " ");
				soma += x;
				x++;
				}
				
				System.out.println("Sum=" + soma);
				
		a = sc.nextInt();
		b = sc.nextInt();
		soma = 0;
		}
		
		sc.close();
		}
				
	}
