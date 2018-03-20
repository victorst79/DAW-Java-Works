public class CamaraFotografica {
	private int numCarretes, fotosValidas, fotosVeladas;
	private Carrete carrete;

	public CamaraFotografica() {
		numCarretes=fotosValidas=fotosVeladas=0;
		carrete = null;
	}

	public void ponerCarrete(Carrete c){
		if (!hayCarrete())
			carrete = c;
			numCarretes++;
	}

	public boolean hayCarrete(){
		if(carrete== null)
			return false;
		return true;
	}

	public boolean sePuedeHacerFoto(){
		if (hayCarrete() && carrete.sePuedeHacer())
			return true;
		return false;
	}

	public void nuevaFotografia(){
		if(sePuedeHacerFoto()){
			carrete.nueva();
		}else{
			System.out.println("No se pudo hacer la fotografía");
		}
	}
	
	public void quitarCarrete(){
		if(hayCarrete()){
			fotosValidas+=carrete.revelar();
			fotosVeladas+=carrete.fotosVeladas();
			carrete=null;
		}else{
			System.out.println("No se pudo quitar el carrete");
		}
	}
}