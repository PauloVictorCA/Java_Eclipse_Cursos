package Secao4_EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Aula_38 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		
		if(a<= 100) {
			System.out.println("Valor a pagar: R$ 50.00");
		}
		else {
			int min = (a-100)*2+50;
			System.out.println("Valor a pagar: R$ " + min + ".00");
		}
		sc.close();
	}
}
