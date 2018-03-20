public class MainVehiculo{
	public static void main(String[] args) {

		System.out.println("Objeto Vehiculo: ");
		Vehiculo vehiculo1 = new Vehiculo();
		vehiculo1.imprimeEstado();

		System.out.println("Coche: ");
		System.out.println("Introduce marca: ");
			String marca = EntradaConsola.leeCadena();
		System.out.println("Introduce matricula: ");
			String matricula = EntradaConsola.leeCadena();
		System.out.println("Introduce color: ");
			String color = EntradaConsola.leeCadena();

		Coche coche = new Coche( matricula, marca, color);
		coche.imprimeEstado();

		System.out.println("CocheAcuatico: ");
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