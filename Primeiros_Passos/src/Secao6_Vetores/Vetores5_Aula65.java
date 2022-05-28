package Secao6_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores5_Aula65 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int soma = 0, cont = 0;
		int n = sc.nextInt();
		while(n<=0) {
			System.out.println("Valor Invalido");
			n = sc.nextInt();
		}
		int [] x = new int [n];
		
		
		for(int i = 0; i<n; i++) {
			x[i] = sc.nextInt();
		}
		
		for(int i = 0; i<n; i++) {	
			if(x[i]%2==0) {
				soma += x[i];
				cont ++;
			}
		}
		double media = (double) soma/cont;
		
		System.out.println(media);
		
		
		sc.close();
		}
				
	}
