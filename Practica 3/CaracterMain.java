public class CaracterMain{
	public static void main(String[] args) {
		
		System.out.println("Letra a ASCII");
			char c = EntradaConsola.leeCaracter();

		System.out.println( Caracter.ordinal(c) );

		System.out.println("-----------------------");

		System.out.println("ASCII a Letra");
			int n = EntradaConsola.leeEntero();

		System.out.println( Caracter.ascii(n) );
	}
}