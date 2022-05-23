package Secao5_EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1131 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = 1, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, z, i, g;
		
		while (x == 1) {
			i = sc.nextInt();
			g = sc.nextInt();
			cont4 += 1;
			if (g>i) {
				cont1 += 1;
			}
			else if (g<i) {
				cont2 += 1;
			}
			else {
				cont3 += 1;
			}
			System.out.println("Novo grenal (1-sim 2-nao)");
			z = sc.nextInt();
			while (z != 1 && z != 2) {
				System.out.println("Novo grenal (1-sim 2-nao)");
				z = sc.nextInt();
			}
			if (z == 1) {
				x = 1;
			}
			else {
				x = 0;
			}
		}
		System.out.println(cont4 + " grenais");
		System.out.println("Inter:" + cont2);
		System.out.println("Gremio:" + cont1);
		System.out.println("Empates:" + cont3);
		
		if (cont1>cont2) {
			System.out.println("Gremio venceu mais");
		}
		else {
			System.out.println("Inter venceu mais");
		}
		
		sc.close();
		}
				
	}
