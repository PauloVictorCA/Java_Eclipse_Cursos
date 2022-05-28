package Secao6_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores6_Aula65 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int w = 1 , cont = 0;
		int n = sc.nextInt();
		while(n<=0) {
			System.out.println("Valor Invalido");
			n = sc.nextInt();
		}
		int [] x = new int [n];
		String [] y = new String[n];
		int z;
		
		for(int i = 0; i<n; i++) {
			System.out.println("Nome " + w);
			y[i] = sc.next();
			System.out.println("Idade " + w);
			x[i] = sc.nextInt();
			w++;
		}
		w = 1;
		z = x[0];
		for(int i = 1; i<n; i++) {
			if (x[i]>z) {
					z = x[i];
					cont = i;
				}
		}
		
		System.out.println("Pessoa mais velha: " + y[cont]);
		
		sc.close();
		}
				
	}
