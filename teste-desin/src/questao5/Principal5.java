package questao5;

import java.util.Scanner;

public class Principal5 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String placa = "ABC-1234";
		String placa2 = "ABC-1C34";
		
		if (Verificador.validadorPlaca(placa)) {
			System.out.println("Para a placa: " + placa.replaceAll("[^a-zA-Z0-9]", "") );
			System.out.println("Padrão: Brasil");
			System.out.println("Correspondente: " + placa.replaceAll("[^a-zA-Z0-9]", "").replace(placa.charAt(5), placa.charAt(2)));
		}
		if (Verificador.validadorPlaca(placa2)) {
			System.out.println("Para a placa: " + placa2.replaceAll("[^a-zA-Z0-9]", "") );
			System.out.println("Padrão: Mercosul");
			System.out.println("Correspondente: " + placa2.replaceAll("[^a-zA-Z0-9]", "").replace(placa2.charAt(5), '2'));
		}
		
		
		s.close();
	}

}
