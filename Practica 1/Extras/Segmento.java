public class Segmento{
	protected Punto p1 , p2;

	public Segmento(Punto p , Punto q){
		p1 = p;
		p2 = q;
	}

	public double longitudSegmento(){
		return p1.distancia(p2);
	}
}