package Secao5_EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Aula_47 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int soma = 0;
		int cont = 0;
		double media = 0;
		
		if(a<0) {
			System.out.println("impossivel calcular");
		}
		else {
		while (a>0) {
			soma += a;
			cont += 1;
			media = (double) soma/cont;
			a = sc.nextInt();
		}
		
		System.out.printf("%.2f\n", media);
		}
		
		sc.close();
	}

}
