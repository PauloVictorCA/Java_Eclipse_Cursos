package Secao5_EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1072 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b;
		int soma = 0, soma2 =0;
		
		for(int i = 1; i<=a; i++) {
			b = sc.nextInt();
				if(b>=10 && b<=20) {
				soma ++;
			}
				else {
				soma2 ++;
			}
			
		}
		System.out.println(soma + " in");
		System.out.println(soma2 + " out");
		sc.close();
		}
				
	}
