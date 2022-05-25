package Secao5_EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1080 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int p, p2, cont =1, p3 = 0, cont1 = 0;
			p = sc.nextInt();
		for(int i=1;i<100;i++) {
			p2 = sc.nextInt();
			cont ++;
			
			if(p2>p) {
				p = p2;
				p3 = p2;
				cont1 = cont;
			}
		}
		System.out.println(p3);
		System.out.println(cont1);
		sc.close();
		}
				
	}
