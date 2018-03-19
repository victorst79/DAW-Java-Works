public class MainUrna{
	public static void main(String[] args) {
		System.out.println("Introduce el numero de bolas NEGRAS");
			int bolas_n = EntradaConsola.leeEntero();
		System.out.println("Introduce el numero de bolas BLANCAS");
			int bolas_b = EntradaConsola.leeEntero();
		
		Urna urna1 = new Urna(bolas_n,bolas_b);

		while(urna1.quedaMasDeUnaBola() == true){
			int saca1 = urna1.sacaBola();
			int saca2 = urna1.sacaBola();

			if (saca1 == saca2) {
				urna1.meteBola(0);
			}else{
				urna1.meteBola(1);
			}

			if(urna1.totalBolas() == 1){
				int saca3 = urna1.sacaBola();
				if (saca3 == 0) {
					System.out.println("La ultima bola es de NEGRA");
				}else{
					System.out.println("La ultima bola es de BLANCA");
				}
			}
		}
	}
}
