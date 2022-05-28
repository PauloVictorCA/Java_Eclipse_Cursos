package Secao6_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores8_Aula65 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double somaAlturaF = 0, mediaAlturaF;
		int cont = 0;
		
		int n = sc.nextInt();
		while(n<=0) {
			System.out.println("Valor Invalido");
			n = sc.nextInt();
		}
		
		char [] sexo = new char[n];
		double [] altura = new double[n];
		
		for(int i = 0; i<n; i++) {
			int quant = i+1;
			System.out.println("Altura e Sexo do " + quant);
			altura [i] = sc.nextDouble();
			sexo [i] = sc.next().charAt(0);
			while (sexo[i] != 'M' && sexo[i] != 'F') {
				System.out.println("Sexo incorreto");
				sexo [i] = sc.next().charAt(0);
			}
		}
		double alturaM1 = altura[0], alturaM2 = altura[0];
		
		
		for(int i = 1; i<n; i++) {
			//menor altura
			if(alturaM1>altura[i]) {
				alturaM1 = altura[i];
			}
			//maior altura
			if(alturaM2<altura[i]) {
				alturaM2 = altura[i];
			}
		}
		System.out.printf("Menor altura = %.2f\n", alturaM1);
		System.out.printf("Maior altura = %.2f\n", alturaM2);
		
		//media altura Feminina
		for(int i = 0; i<n; i++) {
			if(sexo[i] == 'F') {
				somaAlturaF += altura[i];
				cont++;
			}
		}
		mediaAlturaF = somaAlturaF/cont;
		System.out.printf("Media das alturas das mulheres: %.2f\n", mediaAlturaF);
		cont = 0;
		//quantidade de homens
		for(int i = 0; i<n; i++) {
			if(sexo[i] == 'M') {
				
				cont++;
			}
		}
		System.out.println("Numero de homens = " + cont);
		sc.close();
		}
				
}
