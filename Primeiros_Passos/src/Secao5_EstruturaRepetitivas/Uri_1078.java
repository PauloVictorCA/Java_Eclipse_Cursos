package Secao5_EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1078 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int i,x;
		if(a>2 && a<1000) {
			for( i = 1; i <11; i++ ) {
				x = i * a;
				System.out.println(i + " x " + a + " = " + x);
			}
		}
		
		sc.close();
		}
				
	}
