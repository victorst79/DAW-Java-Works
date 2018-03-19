public class MainPrimero{
	public static void main(String[] args) {
		System.out.println("Introduce X");
			int x = EntradaConsola.leeEntero();
		System.out.println("Introduce Y");
			int y = EntradaConsola.leeEntero();


		System.out.println("Introduce PX");
			int px = EntradaConsola.leeEntero();
		System.out.println("Introduce PY");
			int py = EntradaConsola.leeEntero();

		Punto punto = new Punto(x,y);

		punto.distancia(px,py);

		System.out.println("Introduce P");
			int p = EntradaConsola.leeEntero();
		System.out.println("Introduce Q");
			int q = EntradaConsola.leeEntero();

		Segmento segmento = new Segmento(p,q);
		
		double long = segmento.longitudSegmento();
		System.out.println("Longitud del segmento" + long);
	}
}