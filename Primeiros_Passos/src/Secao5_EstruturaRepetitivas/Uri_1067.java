package Secao5_EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1067 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		while(a<1 || a>1000) {
			a = sc.nextInt();
		}
		
		for	(int i = 1; i<=a; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		sc.close();
		}
				
	}
