package classe.Desafio;

public class Pessoa1 {

	String nome;
	double peso;

	//metodo construtor para construir a pessoa :O
	Pessoa1(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	// metodo comer //chamei a classe que criei Comida1
	void comer(Comida1 comida1) {
		if (comida1 != null) {
			this.peso += comida1.peso; //o peso dessa classe será feito a soma com o peso da classe comida.
		}

	}
	
	//metodo mostrar peso na tela
	
	String mostrarPeso(){
		return "Olá meu nome é " + nome + "e peso: " + peso + "kgs.";
	}

}
