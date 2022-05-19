package Secao3_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Aula_25 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double base = sc.nextDouble();
		Double altura = sc.nextDouble();
		
		Double AREA = base * altura;
		Double PERIMETRO = 2 * (base + altura);
		Double DIAGONAL = Math.sqrt(Math.pow(base, 2)+ Math.pow(altura, 2));
		
		System.out.printf("AREA = %.4f\n", AREA);
		System.out.printf("PERIMETRO = %.4f\n", PERIMETRO);
		System.out.printf("DIAGONAL = %.4f\n", DIAGONAL);
		
		sc.close();
	}

}
