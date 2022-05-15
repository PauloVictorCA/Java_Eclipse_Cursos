package Secao3_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Aula_21_1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double a, b, c, area, preco;
		
		System.out.println("Diga o valor da largura do Terreno");
		a = sc.nextDouble();
		System.out.println("Diga o valor da comprimento do Terreno");
		b = sc.nextDouble();
		System.out.println("Diga o valor do metro quadrado do Terreno");
		c = sc.nextDouble();
		
		area = a * b;
		preco = area * c;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		
		
		sc.close();		
	}

}
