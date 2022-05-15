package Secao_IntroducaoSobreProgramacao;

import java.util.Locale;

public class Aula_10 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Double x = 2.578;
		String y = "joão";
		int z = 10;
		
		System.out.println("teste");
		System.out.printf("%.2f\n", x);
		System.out.printf("valor do x = %.2f metros \n", x);
		System.out.println("teste");
		System.out.printf("%s tem %d anos e sua conta possui %.2f reais", y, z, x);
	}

}
