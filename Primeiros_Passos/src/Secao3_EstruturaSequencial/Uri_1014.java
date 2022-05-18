package Secao3_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1014 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int km = sc.nextInt();
		double comb = sc.nextDouble();
		
		double consumo = km/comb;
		
		System.out.printf("%.3f km/l\n", consumo);
		
		sc.close();
		
		
	}

}
