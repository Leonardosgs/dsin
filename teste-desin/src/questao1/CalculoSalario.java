package questao1;

public class CalculoSalario {
	
	double desconto = 0.15;
	
	public double caluloSalario(Trabalhador t, int diasTrabalhados, int horasPordia) { 
		double valorTotalBruto = (diasTrabalhados * horasPordia) * t.getSalarioPorHora();
		double salario = valorTotalBruto - (desconto * valorTotalBruto);
		return salario;
	}

}
