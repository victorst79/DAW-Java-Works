public class MainBombo{
	public static void main(String[] args) {
		System.out.println("Introduce el numero de bolas: ");
			int n = EntradaConsola.leeEntero();

		Bombo bombo = new Bombo(n);

		System.out.println("Los numeros de tu bonoloto son: ");
		for (int i = 0; i < 6 ; i++ ) {
			if (bombo.quedanBolas() == true) {
				bombo.sacaBola();
			}
		}
	}
}