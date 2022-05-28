package Secao6_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1146 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int i,x=1;
		for(i=a;i!=0;i=a) {
			while (x<=a) {
				System.out.print(x);
					if(x<a) {
						System.out.print(" ");
					}
					else {
						System.out.println();
					}
					x++;
			}
			x=1;
			a = sc.nextInt();
		}
		
		sc.close();
		}
				
	}
