package Secao5_EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1132 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max, min, soma = 0;
		
		if(a>b) {
			max = a;
			min = b;
		}
		else {
			max = b;
			min = a;
		}
				
		for(int i = min; i<=max; i++) {
				if(i%13!=0) {
					soma += i;
				}
		}	
		System.out.println(soma);
		sc.close();
		}
				
	}
