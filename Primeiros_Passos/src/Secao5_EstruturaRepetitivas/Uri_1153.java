package Secao5_EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1153 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int mult = a;
		while (a<0 || a>13) {
			a = sc.nextInt();
		}
		for(int i = a-1; i>0; i--) {
			mult *= i;
		}
		System.out.println(mult);
		sc.close();
		}
				
	}
