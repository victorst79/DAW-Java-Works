public class Cilindro extends Circulo{
	protected double altura;
	public Cilindro(double radio, double altura){
		super(radio);
		this.altura = altura;
	}

	public Cilindro(){
		this(1,1);
	}

	public double area(){
		double area_lado = (2 * Math.PI * radio) * altura ;
		double area_base = Math.PI *  Math.pow(radio,2);
		double area = area_lado + (2 * area_base);
		return area;
	}

	public double volumen(){
		double area_base = Math.PI *  Math.pow(radio,2);
		double volumen = area_base * altura;
		return volumen;
	}

}