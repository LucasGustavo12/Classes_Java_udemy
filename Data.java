package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	
	// 01/01/1970
	// Contrutores da Data

	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	Data() {
		
//		dia = 01;
//		mes = 01;
//		ano = 1970;
//		
		this (1, 1, 1970);
		
	}

	// Metodo para formatar data

	// String obterDataFormatada() {
	// return dia + "/" + mes + "/" + ano;
	// }
	
	// Metodo que o professor realizou

	String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato, this.dia, this.mes, this.ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
	
}
