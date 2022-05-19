package Secao3_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			String vendedor = sc.nextLine();
			double salario = sc.nextDouble();
			double venda = sc.nextDouble();
			
			double comissao = venda * .15;
			double ganho = salario + comissao;
			
			System.out.printf("TOTAL = R$ %.2f\n", ganho);
		
		
		sc.close();
	}

}
