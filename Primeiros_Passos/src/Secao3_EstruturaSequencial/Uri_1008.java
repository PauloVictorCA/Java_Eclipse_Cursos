package Secao3_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int NUMBER = sc.nextInt();
		Double HORAS_T = sc.nextDouble();
		Double VALOR_H = sc.nextDouble();
		
		
		Double SALARY = VALOR_H * HORAS_T;
		
		System.out.println("NUMBER = " + NUMBER);
		System.out.printf("SALARY = U$ %.2f\n", SALARY);
		
		sc.close();
		
	}

}
