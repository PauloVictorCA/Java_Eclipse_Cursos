package Secao6_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1158 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int a = sc.nextInt();
		int b, c;
		int i = 1, soma = 0;
		if(a<1) {
			System.out.println("Valor invalido, selecione um valor maior que 0");
			a = sc.nextInt();
			
		}
				
		while(i<=a){
			b = sc.nextInt();
			c = sc.nextInt();
			
			for(int w=1;w<=c;w++) {
				if(b%2!=0) {
					soma += b;
						b += 2;
				}
				else{
					b++;
					soma += b;
					b += 2;
				}
			}
			
			System.out.println(soma);
			
			soma = 0;
			i++;
			
		}
		
		sc.close();
		}
				
	}
