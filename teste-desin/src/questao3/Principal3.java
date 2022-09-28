package questao3;

import java.util.Scanner;

public class Principal3 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Carro c = new Carro();
		c.setValorCarro(80000);
		
		Fabrica f = new Fabrica(0.125, 0.33);
		double valordesconto = c.getValorCarro() * 0.05;
		
		f.calculoCustoFabrica(c.getValorCarro());
		System.out.println("Valor Distribuidor: " + f.getValorDistribuidor());
		System.out.println("Valor Impostos: " + f.getValorImpostos());
		System.out.println("Valor Carro: " + c.getValorCarro());
		System.out.println("Valor desconto: " + valordesconto);
		System.out.println("Valor carro com desconto aplicado: " + (c.getValorCarro() - valordesconto));
		
		
	}

}
