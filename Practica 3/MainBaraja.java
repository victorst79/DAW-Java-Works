public class MainBaraja{
	public static void main(String[] args) {
		// Creamos objetos e Inicializar variables
		BarajaDeCartas baraja = new BarajaDeCartas();

		double totalJugador = 0, totalOrdenador = 0;
		char continuar;

		// Juega el jugador
		Carta carta;
		do{
			carta = baraja.sacaCarta();
			carta.visualizarCarta();
			totalJugador += carta.valorCarta();
			System.out.println("Deseas continuar? (S/N): ");
				continuar = EntradaConsola.leeCaracter();
		}while (continuar == 's' || continuar =='S' && totalJugador <= 7.5 && baraja.quedanCartas());
		
		if (totalJugador > 7.5) {
			System.out.println("Has perdido, gana la banca.");
		}else{
			// Juega ordenador
			do{
			Carta carta1 = baraja.sacaCarta();
			totalOrdenador += carta.valorCarta();
			}while(totalOrdenador <= 6);
		}		
		
		// Ganador
		if (totalOrdenador > 7.5) {
			System.out.println("Enhorabuena has ganado");
		}else if(totalOrdenador >= totalJugador){
			System.out.println("Has perdido, gana la banca.");
		}
	}
}