package Secao6_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Aula_58 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		double [] a = new double[x];
		
		for(int i=0; i<x; i++) {
			a[i] = sc.nextDouble();
		}
		for(int i=0; i<x; i++) {
			System.out.printf("%.2f\n", a[i]);
		}
				
		sc.close();
		}
				
	}
