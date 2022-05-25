package Secao5_EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1079 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		double b,c,d,media;
				
		for(int i = 1; i<=a; i++) {
			b = sc.nextDouble();
			c = sc.nextDouble();
			d = sc.nextDouble();
				media = (b*2+c*3+d*5)/10;
				System.out.printf("%.1f\n", media);
			}
		sc.close();
		}
				
	}
