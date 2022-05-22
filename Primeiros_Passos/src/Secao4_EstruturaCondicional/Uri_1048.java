package Secao4_EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1048 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double s = sc.nextDouble();
		double x;
		
		if (s<=400.00) {
			x = s + s*.15;	
			
		} 
		else if (s>400.00 && s<=800.00) {
			x = s + s*.12;	
			
		}
		else if (s>800.00 && s<=1200.00) {
			x = s + s*.10;	
			
		}
		else if (s>1200.00 && s<=2000.00) {
			x = s + s*.07;	
		}
		else {
			x = s + s*.04;	
		}
		
		double z = x-s;
		double p = (x/s-1)*100;
		
		System.out.printf("Novo salario: %.2f\n", x);
		System.out.printf("Reajuste ganho: %.2f\n", z);
		System.out.printf("Em percentual: %.0f %%\n", p);
		
		sc.close();

	}

}
