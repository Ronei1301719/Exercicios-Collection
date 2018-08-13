package ExCollections;

public class ExecutaBicicleta {
	public static void main(String[] args) {

		Bicicleta bicicleta = new Bicicleta();
		bicicleta.setAro(16);
		bicicleta.setCor("Branca");
		bicicleta.setPreco(350f);

		Bicicleta bicicleta1 = new Bicicleta();
		bicicleta1.setAro(16);
		bicicleta1.setCor("Branca");
		bicicleta1.setPreco(350f);

		System.out.println(bicicleta.equals(bicicleta1));

	}
}
