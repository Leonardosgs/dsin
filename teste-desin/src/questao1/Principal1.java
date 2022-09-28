package questao1;

import java.util.Scanner;

public class Principal1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Trabalhador t = new Trabalhador();
		System.out.println("Nome do Trabalhador: ");
		t.setNome(s.nextLine());
		
		System.out.println("Valor por hora do trabalhador: ");
		t.setSalarioPorHora(s.nextDouble());
		
		System.out.println("Dias trabalhados: ");
		int dias = s.nextInt();
		
		System.out.println("Horas trabalhadas por dia: ");
		int horasPorDia = s.nextInt(); 
		
		CalculoSalario cs = new CalculoSalario();
		double salarioBruto = cs.caluloSalario(t, dias, horasPorDia);
		
		System.out.println("Salario liquido do trabalhador: " + salarioBruto);
		
		s.close();

	}

}
