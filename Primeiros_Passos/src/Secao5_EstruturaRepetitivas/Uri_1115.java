package Secao5_EstruturaRepetitivas;

import java.util.Scanner;

public class Uri_1115 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		while(a!=0 && b!= 0) {
			if(a>0 && b>0 ) {
				System.out.println("primeiro");
			}
			else if(a<0 && b>0 ) {
				System.out.println("segundo");
			}
			else if(a<0 && b<0 ) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			a = sc.nextInt();
			b = sc.nextInt();
		}
		
		sc.close();
	}

}
