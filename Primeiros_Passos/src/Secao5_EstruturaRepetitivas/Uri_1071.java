package Secao5_EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1071 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int i,soma = 0;
		if(a>b) {
			b++;
			for (i=b; i<a;i++) {
				if(i%2!=0) {
					soma += i;
				}
			}
		}
		else {
			a++;
			for (i=a; i<b;i++) {
				if(i%2!=0) {
					soma += i;
				}
			}
		}
		System.out.println(soma);
		
		sc.close();
		}
				
	}