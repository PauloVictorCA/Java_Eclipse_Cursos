package Secao5_EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1157 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
				
		for(int i = 1; i<=a; i++) {
			if(a%i==0) {
				System.out.println(i);
			}
		}
		
		sc.close();
		}
				
	}
