package Secao3_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1018 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int c100 = x/100;
		int rc100 = x%100;
		
		int c50 = rc100/50;
		int rc50 = rc100%50;
		
		int c20 = rc50/20;
		int rc20 = rc50%20;
		
		int c10 = rc20/10;
		int rc10 = rc20%10;
		
		int c5 = rc10/5;
		int rc5 = rc10%5;
		
		int c2 = rc5/2;
		int c1 = rc5%2;
		
		System.out.println(x);
		System.out.println(c100 + " nota(s) de R$ 100,00");
		System.out.println(c50 + " nota(s) de R$ 50,00");
		System.out.println(c20 + " nota(s) de R$ 20,00");
		System.out.println(c10 + " nota(s) de R$ 10,00");
		System.out.println(c5 + " nota(s) de R$ 5,00");
		System.out.println(c2 + " nota(s) de R$ 2,00");
		System.out.println(c1 + " nota(s) de R$ 1,00");
		
		
		sc.close();
	}

}
