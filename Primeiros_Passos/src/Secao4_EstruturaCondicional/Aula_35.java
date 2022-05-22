package Secao4_EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Aula_35 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();	double b = sc.nextDouble();
		double nota = a+b;
		
		if(nota >= 60) {
			System.out.printf("NOTA FINAL = %.1f\n", nota);
		}
		else{
			System.out.printf("NOTA FINAL = %.1f\n", nota);
			System.out.println("REPROVADO");
		}
		sc.close();
	}

}
