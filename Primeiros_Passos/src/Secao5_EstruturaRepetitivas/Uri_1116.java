package Secao5_EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1116 {

	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			int a = sc.nextInt();
			double b,c,divisao;
					
			for(int i = 1; i<=a; i++) {
				b = sc.nextDouble();
				c = sc.nextDouble();
					if(c!=0) {
						divisao = b/c;
						System.out.printf("%.1f\n", divisao);
				}
					else{
						System.out.println("divisao impossivel");
					}
			}		
			sc.close();
			}
					
		}
