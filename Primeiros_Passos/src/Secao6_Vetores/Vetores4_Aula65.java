package Secao6_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores4_Aula65 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		int n = sc.nextInt();
		while(n<=0) {
			System.out.println("Valor Invalido");
			n = sc.nextInt();
		}
		double [] x = new double [n];
		
		
		for(int i = 0; i<n; i++) {
			x[i] = sc.nextDouble();
		}
		
			
		for(int i = 0; i<n; i++) {	
			soma += x[i];
		}
		double media = soma/n;
		System.out.println(media);
		
		for(int i = 0; i<n; i++) {
			if(x[i]<media) {
				System.out.println(x[i]);
			}
		}
		
		
		sc.close();
		}
				
	}
