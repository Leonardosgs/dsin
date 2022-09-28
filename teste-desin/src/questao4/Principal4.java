package questao4;

import java.util.Scanner;

public class Principal4 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int divisaoPorCem = 0;
		int divisaoPorCinquenta = 0;
		int divisaoPorVinte = 0;
		int divisaoPorDez = 0;
		int divisaoPorCinco = 0;
		int divisaoPorDois = 0;
		int divisaoPorUm = 0;
		
		System.out.println("Digite um valor inteiro: ");
		int valor = s.nextInt();
		if (valor > 100) {
			divisaoPorCem = valor / 100;
			valor -= divisaoPorCem * 100;
		} 
		if (valor > 50) {
			divisaoPorCinquenta = valor / 50;
			valor -= divisaoPorCinquenta * 50;
		}
		if (valor > 20) {
			divisaoPorVinte = valor / 20;
			valor -= divisaoPorVinte * 20;
		}
		if (valor > 10) {
			divisaoPorDez = valor / 10;
			valor -= divisaoPorDez * 10;
		}
		if (valor > 5) {
			divisaoPorCinco = valor / 5;
			valor -= divisaoPorCinco * 5;
		}
		if (valor > 2) {
			divisaoPorDois = valor / 2;
			valor -= divisaoPorDois * 2;
		}
		if (valor == 1) {
			divisaoPorUm = 1;
		}
		
		System.out.println(divisaoPorCem + " Notas de R$100.");
		System.out.println(divisaoPorCinquenta + " Notas de R$50.");
		System.out.println(divisaoPorVinte + " Notas de R$20.");
		System.out.println(divisaoPorDez + " Notas de R$10.");
		System.out.println(divisaoPorCinco + " Notas de R$5.");
		System.out.println(divisaoPorDois + " Notas de R$2.");
		System.out.println(divisaoPorUm + " Notas de R$1.");
		
		s.close();
	}

}
