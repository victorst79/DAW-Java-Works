public class BarajaDeCartas{
	protected Carta baraja[][];

	public BarajaDeCartas(){
		baraja = new Carta[4][10];
		for (int palo = 0; palo < 4 ; palo++ ) {
			for (int numero = 0; numero < 10; numero++) {
				baraja[palo][numero] = new Carta(palo + 1,numero + 1);
			}
		}
	}

	public Carta sacaCarta(){
		if ( quedanCartas() ) {
			int palo = (int)(Math.random()*4);
			int num = (int)(Math.random()*10);
			Carta carta = baraja[palo][num];
			return carta;			
		}else{
			System.out.println("No quedan mas cartas en la baraja");
			return null;
		}
	}

	public void meteCarta(Carta carta){
		baraja[carta.palo - 1][carta.num - 1] = carta ;
	}

	public boolean quedanCartas(){
		int nulo = 0;
		int contiene = 0;
		for (int palo = 0; palo < 4 ; palo++ ) {
			for (int numero = 0; numero < 10; numero++) {
				if (baraja[palo][numero] == null) {
					nulo++;
				}else{
					contiene++;
				}
			}
		}
		if (contiene == 0) {
			return false;
		}else{
			return true;
		}
	}
}