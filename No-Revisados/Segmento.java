public class Segmento{
	protected int p, q;

	public Segmento(int p, int q){
		this.p = p;
		this.q = q;		
	}

	public Segmento(){
		this(1,1);
	}

	public double longitudSegmento(){
		double distancia;
		double cal_p = Math.pow( p, 2);
		double cal_q = Math.pow( q, 2);

		distancia = p + q;		

		return Math.sqrt(distancia);
	}
}