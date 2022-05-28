package Secao6_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores7_Aula65 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int w = 1;
		int n = sc.nextInt();
		while(n<=0) {
			System.out.println("Valor Invalido");
			n = sc.nextInt();
		}
		double [] a = new double [n];
		double [] b = new double [n];
		String [] y = new String[n];
		
		double z;
		
		for(int i = 0; i<n; i++) {
			System.out.println("Nome " + w);
			y[i] = sc.next();
			System.out.println("Nota 1º Semestre " + w);
			a[i] = sc.nextDouble();
			System.out.println("Nota 2º Semestre " + w);
			b[i] = sc.nextDouble();
			w++;
		}
		
		System.out.println("Alunos aprovados:");
		for(int i = 0; i<n; i++) {
		
			z = (a[i] + b[i])/2;
			  if(z>=6) {
				  System.out.println(y[i]);
			  }
		}
		
		sc.close();
		}
				
	}