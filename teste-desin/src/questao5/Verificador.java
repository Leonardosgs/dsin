package questao5;

public class Verificador {
	
	String placa;
	
	
	public static boolean validadorPlaca(String placa) {
		placa = placa.replaceAll("[^a-zA-Z0-9]", "");
		if(placa.length() == 7){
			if(placa.substring(0, 3).matches("[A-Z]*") && placa.substring(3,4).matches("[0-9]*") && placa.substring(4,5).matches("[A-Z]*") && placa.substring(5, 7).matches("[0-9]*")){
				return true;
			}
			if(placa.substring(0, 3).matches("[A-Z]*") && placa.substring(3, 6).matches("[0-9]*")) {
				return true;
			}
		   }
		return false;
	}

}
