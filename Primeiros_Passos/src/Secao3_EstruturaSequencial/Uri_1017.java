package Secao3_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double tempo = sc.nextDouble();
		int kmH = sc.nextInt();
		
		double consumo = (kmH*tempo)/12;
		
		System.out.printf("%.3f\n", consumo);
		
		sc.close();
		
		
	}

}
