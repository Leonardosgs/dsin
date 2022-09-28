package questao2;

import java.util.Scanner;

public class Principal2 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		
		System.out.println("valor de A: ");
		a = s.nextInt();
		
		System.out.println("valor de B: ");
		b = s.nextInt();
		
		System.out.println("valor de C: ");
		c = s.nextInt();
		
		System.out.println("valor de D: ");
		d = s.nextInt();
		
		
		if (b > c && d > a) {
			if ((c + d) > (a + b)) {
				if (c > 0 && d > 0 && a % 2 == 0) {
					System.out.println("Valores aceitos.");
				}
			}
		} else {
			System.out.println("Valores não aceitos.");
		}
		
		System.out.println();
		s.close();
	}

}
