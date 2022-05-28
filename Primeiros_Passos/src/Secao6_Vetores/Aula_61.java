package Secao6_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Aula_61 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int [] x = new int [a];
		int i;
		for (i = 0; i<a; i++) {
			x[i] = sc.nextInt();
		}
		
		for (i = 0; i<a; i++) {
			if (x[i]<0) {
				System.out.println(x[i]);
			}
		}	
		sc.close();
		}
				
	}
