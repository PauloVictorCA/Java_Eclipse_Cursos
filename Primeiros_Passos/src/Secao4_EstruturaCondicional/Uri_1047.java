package Secao4_EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1047 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		
		int inicio = h1*60 + m1;
		int fim = h2*60 + m2;
		int duracao;
		
		if (inicio < fim) {
			duracao = fim - inicio;
		}
		else {
			duracao = 24*60-inicio+fim;
		}
		
		int hf = duracao/60;	
		int mf = duracao%60;
		
		System.out.println("O JOGO DUROU " +hf + " HORA(S) E " + mf + " MINUTO(S)");
		
		sc.close();
	}

}
