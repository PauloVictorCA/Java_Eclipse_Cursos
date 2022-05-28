package Secao6_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores1_Aula65 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double y = 0;
		int cont =0;
		while(N<=0) {
			System.out.println("Numero Invalido");
			N = sc.nextInt();
		}
		double [] x = new double [N];
		
		for (int i=0; i<N; i++) {
			x[i] = sc.nextDouble();
			//System.out.printf("%.1f\n", x[i]);
		}
		
		for (int i=1; i<N; i++) {
			if(x[i]>x[i-1]) {
				y = x[i];
				cont = i;
			}
		}
		System.out.printf("%.1f\n", y);
		System.out.println(cont);
		
		sc.close();
		}
				
	}