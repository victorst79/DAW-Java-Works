public class MainPila{
	public static void main(String[] args) {
		System.out.println("Introduce elemento en la pila:");
			String ob = EntradaConsola.leeCadena();
		Pila pila = new Pila(ob);

		System.out.println("Introduce elemento en la pila:");
			String ob2 = EntradaConsola.leeCadena();
		pila.push(ob2);

		System.out.println("Cima en este momento:");
		System.out.println( pila.cima() );

		System.out.println("Pila vacia?");
		System.out.println( pila.vacia() );

		System.out.println("Sacando un elemento de la pila...");		
		pila.pop();

		System.out.println("Cima en este momento:");
		System.out.println( pila.cima() );
	}
}