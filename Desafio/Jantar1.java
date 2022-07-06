package classe.Desafio;
// classe em que faço a entrada dos dados main
public class Jantar1 {
	public static void main(String[] args) {
		
		//criei a pessoa com o metodo construtor da classe pessoa
		Pessoa1 p1 = new Pessoa1("Luana", 54.0);
		//criei a comida com o metodo construtor da classe comida
		Comida1 c1 = new Comida1("Uva", 2.0);
		
		// usei o metodo que mostra o peso
		System.out.println(p1.mostrarPeso());
		//usei o metodo comer
		p1.comer(c1);
		//usei o metodo que mostra o peso
		System.out.println(p1.mostrarPeso());
		
	}
}
