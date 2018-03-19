public class MainBonoloto{
	public static void main(String[] args) {
		System.out.println("Introduce el numero de bolas: ");
			int n = EntradaConsola.leeEntero();

		System.out.println("Bonoloto: ");

		Bombo bombo = new Bombo(n);

		for (int i = 0; i < 6; i++) {
			System.out.print(bombo.sacaBola() + " ");
		}
	}
}