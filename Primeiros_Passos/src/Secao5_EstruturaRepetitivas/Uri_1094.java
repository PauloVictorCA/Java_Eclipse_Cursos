package Secao5_EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1094 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		int x, cont1 = 0, cont2 = 0, cont3 = 0, somat = 0;
		double pc = 0,pr = 0,ps = 0;
		char a;
					
		for(int i=1;i<=p;i++) {
			x = sc.nextInt();
				while (x<=0) {
				System.out.println("Quantidade incorreta");
				x = sc.nextInt();
				}
			a = sc.next().charAt(0);
				while (a !='C' && a !='R' && a !='S') {
					System.out.println("Animal invalido");
					a = sc.next().charAt(0);
				}
				somat += x; 
					if(a =='C') {
						cont1 += x;
					}
					else if (a == 'R'){
						cont2 += x;
					}
					else {
						cont3 += x;
					}
				
				 if(cont1>0) {
				pc = (double) cont1*100/somat;
				 }
				 if(cont2>0) {
				pr = (double) cont2*100/somat;
				 }
				 if(cont3>0) {
				ps = (double) cont3*100/somat;
				 }
				
		}
		
		System.out.println("Total: "+ somat + " cobaias");
		System.out.println("Total de coelhos: " + cont1);
		System.out.println("Total de ratos: " + cont2);
		System.out.println("Total de sapos: " + cont3);
		System.out.printf("Percentual de coelhos: %.2f %%\n",pc);
		System.out.printf("Percentual de ratos: %.2f %%\n",pr);
		System.out.printf("Percentual de sapos: %.2f %%\n",ps);
		sc.close();
		}
				
	}
