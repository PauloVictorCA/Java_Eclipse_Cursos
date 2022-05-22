package Secao4_EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1045 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double x, y, z, x2, y2, z2;
		
		if(a>=b && a>=c && b>=c) {
			x = a; y = b; z = c;
		}
		else if(a>=b && a>=c && c>=b) {
			x = a; y = c; z = b;
		}
		else if(b>=a && b>=c && a>=c) {
			x = b; y = a; z = c;
		}
		else if(b>=a && b>=c && c>=a) {
			x = b; y = c; z = a;
		}
		else if (c>=a && c>=b && a>=b){
			x = c; y = a; z = b;
		}
		else {
			x = c; y = b; z = a;
		}
		
		x2 = Math.pow(x, 2);
		y2 = Math.pow(y, 2);
		z2 = Math.pow(z, 2);
		
		if (x >= y+z) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		else if (x2 == y2+z2) {
			System.out.println("TRIANGULO RETANGULO");
		}
		else if (x2 > y2+z2) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		else if (x2 < y2+z2) {
			System.out.println("TRIANGULO ACUTANGULO");
		}
		
		if (x==y && x==z) {
			System.out.println("TRIANGULO EQUILATERO");
		}
		else if (x==y || x==z || y==z) {
			System.out.println("TRIANGULO ISOSCELES");
		}
		
		sc.close();

	}

}
