public class Circulo{
	protected double radio = 0;
	public Circulo(double radio){
		this.radio = radio;
	}

	public Circulo(){
		this(1);
	}

	public double area(){
		double area = Math.PI *  Math.pow(radio,2);
		return area;
	}

	public double circunferencia(){
		double circunferencia = 2 * ( Math.PI *  Math.pow(radio,2) );
		return circunferencia;
	}
}