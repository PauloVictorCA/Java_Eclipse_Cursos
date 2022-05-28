package Secao6_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Aula_63 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i; 
		double somaAltura = 0, mediaAltura, contMenor16 = 0, porcMenor16;
		
		int a = sc.nextInt();
		while(a<0) {
			System.out.println("Valor invalido, selecione um número real");
			a = sc.nextInt();
		}
		int [] x = new int [a];
		String [] y = new String [a];
		int [] z = new int [a];
		double [] w = new double [a];
		
		//Incluir Dados
		for (i = 0; i<a; i++) {
			System.out.println("Nome, Idade, Altura");
			y[i] = sc.next();
			z[i] = sc.nextInt();
			w[i] = sc.nextDouble();
			somaAltura += w[i];
			if(z[i]<16) {
				contMenor16 ++;
			}
			
		}
		
		//Altura
			mediaAltura = somaAltura/a;
			System.out.printf("Altura média: %.2f\n", mediaAltura);
			porcMenor16 = (double) contMenor16*100/a;
			System.out.printf("Pessoas com menos de 16 anos: %.1f %%\n", porcMenor16);
		
		sc.close();
		}
				
	}
