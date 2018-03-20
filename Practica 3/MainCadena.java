public class MainCadena{
	public static void main(String[] args) {
			System.out.println("Introduce elemento en cadena:");
			String c = EntradaConsola.leeCadena();
			
			Cadena cad = new Cadena(c);

			System.out.println("Cadena Creada");
			cad.visualizaCadena();

			System.out.println("Invertir Cadena");
			cad.invierteCadena();
			cad.visualizaCadena();

			System.out.println("Cadena a la normalidad");
			cad.invierteCadena();
			cad.visualizaCadena();

			System.out.println("Cadena Encriptada");
			cad.encriptaCadena();
			cad.visualizaCadena();

			System.out.println("Cadena desecriptada");
			cad.desencriptaCadena();
			cad.visualizaCadena();
	}
}
