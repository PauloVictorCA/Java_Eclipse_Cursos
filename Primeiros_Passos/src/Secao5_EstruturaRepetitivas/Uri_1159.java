package Secao5_EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1159 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int cont = 0, soma,x;
		while(a!=0) {
			if (a%2==0) {
				soma = 5*a+20;
				System.out.println(soma);
				a = sc.nextInt();
			}
			else {
				x = a + 1;
				soma = 5*x+20;
				System.out.println(soma);
				a = sc.nextInt();
			}
		}
		
		sc.close();
	}

}