public class MainSerVivo{
	public static void main(String[] args) {
		String partes[];

		System.out.println("Introduce nombre cientifico: ");
			String nomCientifico = EntradaConsola.leeCadena();
		System.out.println("Introduce nombre vulgar: ");
			String nomVulgar = EntradaConsola.leeCadena();
		System.out.println("Cuantas partes tiene el vegetal: ");
		int n = EntradaConsola.leeEntero();
		partes = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Introduce nombre de la parte: ");
			partes[i] = EntradaConsola.leeCadena();
		}
		Vegetal vegetal = new Vegetal(nomCientifico,nomVulgar,partes);

		vegetal.describete();
	}
}