public class Coche extends Vehiculo{
	protected String matricula, marca, color;

	// public Coche(int x, int y ,boolean arrancado,int direccion,String matricula, String marca, String color){
	// 	super(x,y,arrancado,direccion);
	// 	this.matricula = matricula;
	// 	this.marca = marca;
	// 	this.color = color;
	// }

	public Coche(String matricula, String marca, String color){
	super();
	this.matricula = matricula;
	this.marca = marca;
	this.color = color;
}

	public String getMarca(){
		return marca;
	}

	public String getMatricula(){
		return matricula;
	}

	public String getColor(){
		return color;
	}

	public void imprimeEstado(){
		super.imprimeEstado();
		System.out.println("Marca: " + marca);
		System.out.println("Matricula " + matricula);
		System.out.println("Color: " + color);
	}
}