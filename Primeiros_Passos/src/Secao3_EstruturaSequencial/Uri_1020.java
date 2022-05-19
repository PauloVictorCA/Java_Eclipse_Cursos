package Secao3_EstruturaSequencial;

import java.util.Scanner;

public class Uri_1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int ano = x/365;
		int rAno = x%365;
		int mes = rAno/30;
		int dia = rAno%30;
		
		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");
		
		sc.close();
	}

}
