package questao3;

public class Fabrica {
	
	private double porcentagemcustoDistribuidor;
	private double porcentagemImpostos;
	private double valorDistribuidor;
	private double valorImpostos;
	
	public Fabrica(double porcentagemcustoDistribuidor, double porcentagemImpostos) {
		this.porcentagemcustoDistribuidor = porcentagemcustoDistribuidor;
		this.porcentagemImpostos = porcentagemImpostos;
	}
	
	public void calculoCustoFabrica(double valorCarro) {
		this.valorDistribuidor = porcentagemcustoDistribuidor * valorCarro;
		this.valorImpostos = porcentagemImpostos * valorCarro;
	}

	public double getValorDistribuidor() {
		return valorDistribuidor;
	}

	public double getValorImpostos() {
		return valorImpostos;
	}

	
	

}
