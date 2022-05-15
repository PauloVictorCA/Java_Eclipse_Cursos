package Secao3_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1001 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		int A, B, soma;
		
		A = sc.nextInt();	B = sc.nextInt();
		soma = A + B;
		
		System.out.println("X = " + soma);
				
		sc.close();
		
	}

}
