package Secao6_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Aula_62 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		while(a<0) {
			System.out.println("Valor invalido, selecione um número real");
			a = sc.nextInt();
		}
		double [] x = new double [a];
		int i;
		double soma = 0, media;
		for (i = 0; i<a; i++) {
			x[i] = sc.nextInt();
		}
				
		for (i = 0; i<a; i++) {
			System.out.print(x[i] + " ");
			soma += x[i];
			
		}
		System.out.println();
		media = soma/a;
		System.out.printf("%.2f\n", soma);
		System.out.printf("%.2f\n", media);
		sc.close();
		}
				
	}
