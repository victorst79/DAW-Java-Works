public class MainCola{
	public static void main(String[] args) {
		System.out.println("Introduce elemento en la cola:");
			String ob = EntradaConsola.leeCadena();

		Cola cola = new Cola(ob);

		System.out.println("Introduce otro elemento en la cola:");
			String ob2 = EntradaConsola.leeCadena();
		cola.ponEnCola(ob2);

		System.out.println("Frente de la cola:");
		System.out.println( cola.frente() );

		System.out.println("Retiramos un elemento de la cola");
		cola.extraeDeCola();
		System.out.println( cola.frente() );

		System.out.println("Retiramos otro elemento y comprobamos si esta vacia");
		cola.extraeDeCola();
		System.out.println( cola.vacia() );

	}
}