package Secao3_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1021 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double y = sc.nextDouble();
		int x = (int) (y*100);
		
		int n100 =  x/10000;		int rn100 =  x%10000;
		int n50 =  rn100/5000;		int rn50 =  rn100%5000;
		int n20 =  rn50/2000;		int rn20 =  rn50%2000;
		int n10 =  rn20/1000;		int rn10 =  rn20%1000;
		int n5 =  rn10/500;		int rn5 =  rn10%500;
		int n2 =  rn5/200;		int rn2 =  rn5%200;
		
		int m100 =  rn2/100;		int rm100 =  rn2%100;
		int m50 =  rm100/50;		int rm50 =  rm100%50;
		int m25 =  rm50/25;		int rm25 =  rm50%25;
		int m10 =  rm25/10;		int rm10 =  rm25%10;
		int m5 =  rm10/5;		int m1 =  rm10%5;
		
		System.out.println("NOTAS:");
		System.out.println(n100 + " nota(s) de R$ 100.00");
		System.out.println(n50 + " nota(s) de R$ 50.00");
		System.out.println(n20 + " nota(s) de R$ 20.00");
		System.out.println(n10 + " nota(s) de R$ 10.00");
		System.out.println(n5 + " nota(s) de R$ 5.00");
		System.out.println(n2 + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(m100 + " moeda(s) de R$ 1.00");
		System.out.println(m50 + " moeda(s) de R$ 0.50");
		System.out.println(m25 + " moeda(s) de R$ 0.25");
		System.out.println(m10 + " moeda(s) de R$ 0.10");
		System.out.println(m5 + " moeda(s) de R$ 0.05");
		System.out.println(m1 + " moeda(s) de R$ 0.01");
		
		sc.close();
	}

}
