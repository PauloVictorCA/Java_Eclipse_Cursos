package Secao4_EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1046 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int x;
		
		if(a>b) {
			x = 24-a+b;
		}
		else if(a==b) {
			x = 24;
		}
		else {
			x = b-a;
		}
		
		System.out.println("O JOGO DUROU " + x + " HORA(S)");
		
		sc.close();

	}

}
