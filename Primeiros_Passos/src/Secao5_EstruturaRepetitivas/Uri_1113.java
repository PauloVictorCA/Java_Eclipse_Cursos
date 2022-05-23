package Secao5_EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1113 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		while (a>b || a<b) {
			if(a>b) {
				System.out.println("Decrescente");
			}
			else {
				System.out.println("Crescente");
			}
			a = sc.nextInt();
			b = sc.nextInt();
		}
		
		sc.close();
	}

}
