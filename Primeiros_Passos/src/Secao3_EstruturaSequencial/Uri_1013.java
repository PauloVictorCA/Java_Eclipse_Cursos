package Secao3_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1013 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int MaiorAB = (a+b+Math.abs(a-b))/2;
		int outro = (MaiorAB+c+Math.abs(MaiorAB-c))/2;
		
		System.out.println(outro + " eh o maior");
			
		
		sc.close();
	}

}