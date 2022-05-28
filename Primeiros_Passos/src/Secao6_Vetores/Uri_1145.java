package Secao6_Vetores;

import java.util.Scanner;

public class Uri_1145 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int x = 1;
		int a = sc.nextInt();
		while (a<1 || a>20){
			System.out.println("Valor deve ser entre 1 e 20");
			a = sc.nextInt();
		}
		
		int b = sc.nextInt();
		while (b<a || b>100000){
			System.out.println("Valor deve ser entre " + a + " e 100 mil");
			b = sc.nextInt();
		}
		
		for(int y = 1; y<=b; y++ ){
			
			while(x<=a && y<=b) {
				
				System.out.print(y);
				y++;
				x++;
				if(x<=a) {
					System.out.print(" ");
				}
			}
			if(x<=b) {
				System.out.println("");	
			}
			x=1;
			y--;
		}
		sc.close();
	}

}
