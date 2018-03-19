public class MainCilindro{
	public static void main(String[] args) {
		System.out.println("Introduce el radio: ");
			double radio = EntradaConsola.leeReal();
		System.out.println("Introduce la altura: ");
			double altura = EntradaConsola.leeReal();

		Cilindro cilindro1 = new Cilindro(radio, altura);
		System.out.println("El area es : " + cilindro1.area() );
		System.out.println("El volumen es : " + cilindro1.volumen() );
	}
}