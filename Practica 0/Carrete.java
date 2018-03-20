public class Carrete {
	private static int fotosRealizadas;
	private static int capacidad;
	private static int fotosValidas,fotosVeladas;
	

	public Carrete( int capCarrete){
		if (capCarrete == 12 || capCarrete == 24 || capCarrete == 36)
			this.capCarrete = capCarrete;
		else
			this.capCarrete = 12;
			fotosRealizadas = 0;
			fotosValidas = 0;
			fotosVeladas = 0;
	}

	public Carrete(){
			super(12);
	}

	public Nueva(){
		if(sePuedeHacer())
			fotosRealizadas++;
		else
			System.out.println("El carrete está completo");
	}

	public boolean sePuedeHacer(){
		if(fotosRealizadas < capCarrete){
			return true;
		}
			return false;
	}

	public boolean estaLleno(){
		if(fotosRealizadas== capCarrete){
			return true;
		}
		return false;
	public int fotosValidas(){
		return fotosValidas;
	}

	public int revelar(){
		for (int i=1; i <=fotosRealizadas; i++ ){
			int aleatorio = (int) (Math.random() *100 +1);
			if (aleatorio <= 98)
				fotosValidas++;
		}
		return fotosValidas;
	}	
}
