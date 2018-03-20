public class ListaMain{
	public static void main(String[] args) {
		System.out.println("Introduce elemento en lista:");
			String ob = EntradaConsola.leeCadena();

		Lista lista = new Lista( ob );
		
		System.out.println("Visualizar objeto:");
		lista.visualizaElemento();

		System.out.println("Introduce otro elemento en lista:");
			String ob2 = EntradaConsola.leeCadena();

		lista.ponPrimero(ob2);
		lista.visualizaElemento();

		System.out.println("Introduce otro elemento en lista:");
			String ob3 = EntradaConsola.leeCadena();

		lista.ponUltimo(ob3);
		lista.visualizaElemento();

		System.out.println("Esta vacia la lista?");
		System.out.println( lista.estaVacia() );

		System.out.println("Eliminar el primer elemento");
		lista.extraePrimero();
		lista.visualizaElemento();

		System.out.println("Eliminar el ultimo elemento");
		lista.extraeUltimo();
		lista.visualizaElemento();

	}
}