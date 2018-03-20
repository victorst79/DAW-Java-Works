public class MainCoche{
	public static void main(String[] args) {

		System.out.println("Introduce marca: ");
			String marca = EntradaConsola.leeCadena();
		System.out.println("Introduce matricula: ");
			String matricula = EntradaConsola.leeCadena();
		System.out.println("Introduce color: ");
			String color = EntradaConsola.leeCadena();

		Coche coche = new Coche( matricula, marca, color);
		coche.imprimeEstado();
	}
}