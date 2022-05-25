package Secao5_EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1074 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b;
				
		for(int i = 1; i<=a; i++) {
			b = sc.nextInt();
				if(b%2==0 && b!=0) {
					System.out.print("EVEN ");
			}
				else if (b%2!=0 && b!=0){
					System.out.print("ODD ");
			}
				else {
					System.out.println("NULL");
				}
			while(b!=0) {
				if(b>0) {
					System.out.println("POSITIVE");
				}
				else{
					System.out.println("NEGATIVE");
				}
				b=0;
			}
		}
		
		sc.close();
		}
				
	}