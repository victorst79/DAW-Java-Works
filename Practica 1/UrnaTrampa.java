public class UrnaTrampa extends Urna{
	public int sacaBola(){
		if ( quedanBolas() ) {
			if ( (int)(Math.random() * bolas() + 1 ) <= bolas_n) {
				System.out.println("La bola es NEGRA");
				bolas_n--;
				if (bolas_b > 0 && bolas_n > 0) {
					if (Math.random() * 100 + 1 < 2) {
						if (Math.random() * 2 + 1 == 1) {
							bolas_b--;
							bolas_n++;
						}else{
							bolas_b++;
							bolas_n++;
						}
					}
				}
				return 0;
			}else{
				// saca bola blanca
			}
		}

	}
}