package Secao3_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int peca1, quatP1, peca2, quatP2;
		Double valorP1, valorP2, ValorTotal;
		
		peca1 = sc.nextInt();
		quatP1 = sc.nextInt();
		valorP1 = sc.nextDouble();
		peca2 = sc.nextInt();
		quatP2 = sc.nextInt();
		valorP2 = sc.nextDouble();
		
		ValorTotal = quatP1 * valorP1 + quatP2 * valorP2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", ValorTotal);
		sc.close();
		
		
	}

}
