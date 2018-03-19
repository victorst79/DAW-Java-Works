public class Urna{
	protected int bolas_n, bolas_b;
	public Urna(int bolas_n, int bolas_b){
		this.bolas_n = bolas_n;
		this.bolas_b = bolas_b;		
	}

	public Urna(){
		this(1,1);
	}

	public int bolas(){
		return(bolas_n + bolas_b);
	}

	public int sacaBola(){ // 0 - NEGRO / 1 - BLANCO
		int num = (int) Math.random() * bolas() + 1;
		if (num <= bolas_n) {
			bolas_n--;
			return 0;
		}else{
			bolas_b--;
			return 1;
		}
	}

	public void meteBola(int color){
		if( color == 0){
			bolas_n++;
		}else if( color == 1){
			bolas_b++;
		}
	}

	public boolean quedanBolas(){
		if (bolas() > 0) {
			return true;
		}else{
			return false;
		}
	}

	public boolean quedaMasDeUnaBola(){
		if (bolas() > 1) {
			return true;
		}else{
			return false;
		}
	}

	public int totalBolas(){
		return bolas();
	}

}