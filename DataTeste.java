package classe;

public class DataTeste {
	public static void main(String[] args) {

		Data d1 = new Data(28, 04, 1998);

		Data d2 = new Data(28, 06, 2022);

		Data d3 = new Data();

		System.out.println(d1.obterDataFormatada());
		System.out.printf(d2.obterDataFormatada());
		System.out.printf(d3.obterDataFormatada());

	
	}
}
