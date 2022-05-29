package Secao7_Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Aula_72 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		while(x<0) {
			System.out.println("Valor invalido");
			x = sc.nextInt();
		}
		int y = sc.nextInt();
		while(y<0) {
			System.out.println("Valor invalido");
			y = sc.nextInt();
		}
		
		double [][] a = new double [x][y];
		
		for(int i = 0; i<x; i++) {
			for (int j = 0; j<y; j++) {
				a[i][j] = sc.nextDouble();
			}
		}
		
		double [] b = new double [x];
		
		for(int i = 0; i<x; i++) {
			double soma = 0;
			for (int j = 0; j<y; j++) {
				soma += a[i][j];	
				}
			b[i] = soma;
			System.out.println(b[i]);
		}
		
		sc.close();
	}	
}
