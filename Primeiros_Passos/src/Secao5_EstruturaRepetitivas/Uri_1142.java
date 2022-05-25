package Secao5_EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1142 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		String a = "PUM";
		int x = 1, y = 2, z = 3;
		
		for(int i=1;i<=p;i++) {
			System.out.println(x + " " + y + " " + z + " " + a);
			x = z + 2;
			y = x + 1;
			z = y + 1;
		}
		
		
		sc.close();
		}
				
	}
