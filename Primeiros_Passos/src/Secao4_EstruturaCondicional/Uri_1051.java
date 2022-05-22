package Secao4_EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1051 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double s = sc.nextDouble();
		
		double x1, x2, x3, imposto;
		
		if(s<=2000) {
			System.out.println("Isento");
		}
		
		else if (s>2000 && s<=3000) {
			imposto = (s-2000)*.08;
			System.out.printf("R$ %.2f\n", imposto);
		}
		
		else if (s>3000 && s<=4500) {
			x1 = s-3000; x2 = s-(x1+2000);
			imposto = x1*.18 + x2*.08;
			System.out.printf("R$ %.2f\n", imposto);
		}	
		
		else {
			x1 = s-4500; x2 = s-(x1+3000); x3 = s-(x1+x2+2000);
			imposto = x1*.28 + x2*.18 + x3*.08;
			System.out.printf("R$ %.2f\n", imposto);
		}
			
		sc.close();


	}

}
