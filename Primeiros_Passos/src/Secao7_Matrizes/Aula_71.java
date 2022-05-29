package Secao7_Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Aula_71 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m =n,cont = 0;
		while(n<0) {
			System.out.println("Valor invalido");
			n = sc.nextInt();
		}
		int [][] a = new int [n][m];
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				System.out.println("informe a matrix " + i + "," + j);
				a[i][j] = sc.nextInt();
			}
			
		}
		System.out.println("DIAGONAL PRINCIPAL:");
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				if(i==j) {
				System.out.print(a[i][j] + " ");
				}
			}				
		}
		System.out.println();
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				if(a[i][j]<0) {
					cont++;
				}
			}				
		}
		System.out.println("QUANTIDADE DE NEGATIVOS = " + cont);
		
		
		sc.close();
	}

}
