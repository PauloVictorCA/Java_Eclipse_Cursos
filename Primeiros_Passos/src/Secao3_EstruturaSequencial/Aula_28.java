package Secao3_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Aula_28 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tempo = sc.nextInt();
		
		int seg = tempo%60;
		int restseg = tempo/60;
		int min = restseg%60;
		int restmin = restseg/60;
		int hora = restmin%60;
		
		System.out.println(hora + ":" + min + ":" + seg);
		sc.close();
	}

}
