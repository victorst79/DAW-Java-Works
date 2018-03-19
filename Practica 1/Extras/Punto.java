public class Punto{
	protected int x , y;

	public Punto(int x, int y){
		this.x = x;
		this.y = y;
	}

	public double distancia(int px, int py){
		return Math.sqrt( (x - px)*(x - px) + (y - py)*(y - py));
	}

	public double distancia(Punto p){
		return Math.sqrt( (x - p.x)*(x - p.x) + (y - p.y)*(y - p.y) );
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}
}