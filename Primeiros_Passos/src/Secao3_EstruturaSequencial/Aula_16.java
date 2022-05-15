package Secao3_EstruturaSequencial;

import java.util.Locale;

public class Aula_16 {

	public static void main(String[] args) {
		
		
		String product1, product2;
		int age, code;
		double price1, price2, measure;
		char gender ='F';
		
		product1 = "Computer";		product2 = "Office desk";
		age = 30;	code = 5290;
		price1 = 2100.0;	price2 = 650.50;	measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f\n", product1, price1);
		System.out.printf("%s, which price is $ %.2f\n\n", product2, price2);
		System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender + "\n");
		System.out.printf("Measue with eitht decimal places: %.7f\n", measure);
		System.out.printf("Rouded (three decimal places): %.3f\n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);

	}

}
