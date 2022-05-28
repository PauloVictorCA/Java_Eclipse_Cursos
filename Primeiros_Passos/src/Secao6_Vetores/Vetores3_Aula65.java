package Secao6_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores3_Aula65 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int soma;
		int n = sc.nextInt();
		while(n<=0) {
			System.out.println("Valor Invalido");
			n = sc.nextInt();
		}
		int [] x = new int [n];
		int [] y = new int [n];
		
		System.out.println("Informe os primeiros " + n + " valores");
		for(int i = 0; i<n; i++) {
			x[i] = sc.nextInt();
		}
		
		System.out.println("Informe os segundos " + n + " valores");
		for(int i = 0; i<n; i++) {
			y[i] = sc.nextInt();
		}
			
		for(int i = 0; i<n; i++) {	
			soma = x[i] + y[i];
				System.out.print(soma + " ");
		}
		System.out.println();
		
		
		sc.close();
		}
				
	}
