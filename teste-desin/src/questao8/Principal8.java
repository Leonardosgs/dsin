package questao8;

public class Principal8 {

	public static void main(String[] args) {

		int n = 5;
		int[][] matriz = new int[n][n];
		
		int i = 2;
		
		for (int coluna = 0; coluna <= 4; i+=2, coluna++) {
			matriz[0][coluna] = i;
		}
		for (int linha = 1; linha <= 4; i+=2, linha++) {
			matriz[linha][4] = i;
		}
		for (int coluna = 3; coluna >= 0; i+=2, coluna--) {
			matriz[4][coluna] = i;
		}
		for (int linha = 3; linha >= 1; i+=2,linha--) {
			matriz[linha][0] = i;
		}
		for (int coluna = 1; coluna <= 3; i+=2,coluna++) {
			matriz[1][coluna] = i;
		}
		for (int linha = 1; linha <= 3; i+=2,linha++) {
			matriz[linha][3] = i;
		}
		for (int coluna = 2; coluna >= 1; i+=2,coluna--) {
			matriz[3][coluna] = i;
		}
		for (int coluna = 1; coluna <= 2; i+=2, coluna++) {
			matriz[2][coluna] = i;
		}
		
		for (int linha = 0; linha <= 4; linha++) {
			for (int coluna = 0; coluna <= 4; coluna++) {
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.println("");
		}
		

	}
}
