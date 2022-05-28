package Secao6_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores9_Aula65 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double porcentagem, lucro, somaVenda = 0, somaCompra = 0;		
		int cont1 =0, cont2 =0, cont3 =0;
		int n = sc.nextInt();
		while(n<=0) {
			System.out.println("Valor Invalido");
			n = sc.nextInt();
		}
		
		String [] produto = new String [n];
		double [] valorCompra = new double [n];
		double [] valorVenda = new double [n];
		
		for(int i = 0; i<n; i++) {
			int x = i+1;
			System.out.println("Informe o nome do produto, valor de compra e valor de venda do item " + x);
			produto [i] = sc.next();
			valorCompra [i] = sc.nextDouble();
			valorVenda [i] = sc.nextDouble();
			somaCompra += valorCompra[i];
			somaVenda += valorVenda[i];
			
		}
		//porcentagem de lucro
		for(int i = 0; i<n; i++) {
			porcentagem = ((valorVenda[i]/valorCompra[i])-1)*100;
			if(porcentagem < 10) {
				cont1 ++;
			}
			else if(porcentagem>=10 && porcentagem<20) {
				cont2 ++;
			}
			else {
				cont3 ++;
			}
			
			
		}
		lucro = somaVenda - somaCompra;
		System.out.println("Lucro abaixo de 10%: " + cont1);
		System.out.println("Lucro entre 10% e 20%: " + cont2);
		System.out.println("Lucro acima de 20%: " + cont3);
		System.out.printf("Valor total de compra: %.2f\n", somaCompra);
		System.out.printf("Valor total de venda: %.2f\n", somaVenda);
		System.out.printf("Lucro total: %.2f\n", lucro);
		sc.close();
		}
				
}