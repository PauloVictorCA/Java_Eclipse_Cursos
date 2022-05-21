package Secao3_EstruturaSequencial;

import java.util.Scanner;

public class Uri_1061 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String dia, var;
		int d1, d2, h1, m1, s1, h2, m2, s2;
		
		dia = sc.next(); 
		d1 = sc.nextInt();
		h1 = sc.nextInt();
		var = sc.next(); 
		m1 = sc.nextInt();
		var = sc.next(); 
		s1 = sc.nextInt();
		
		dia = sc.next(); 
		d2 = sc.nextInt();
		h2 = sc.nextInt();
		var = sc.next(); 
		m2 = sc.nextInt();
		var = sc.next(); 
		s2 = sc.nextInt();
		
		int cal1 = s1 + m1*60 + h1*3600 + d1*86400;
		int cal2 = s2 + m2*60 + h2*3600 + d2*86400;
		int valorT = cal2 - cal1;
		
		int df = valorT / 86400;	int dfr = valorT % 86400;
		int hf = dfr / 3600;		int hfr = dfr % 3600;
		int mf = hfr /60;			int sf = hfr % 60;
		
		System.out.println(df + " dia(s)");
		System.out.println(hf + " hora(s)");
		System.out.println(mf + " minuto(s)");
		System.out.println(sf + " segundo(s)");
		
		sc.close();
	}

}
