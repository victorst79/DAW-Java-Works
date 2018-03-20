public class Avion extends Vehiculo{
	protected int z;
	protected boolean despegado;

	public Avion(int z, boolean despegado){
		super();
		this.z = z;
		this.despegado = despegado;
	}

	public Avion(){
		super();
		z = 0;
		despegado = false;
	}

	public void despegar(){
		if( estaArrancado() == true ){
			z = 1;
			despegado = true;
		}else{
			System.out.println("Arranca el vehiculo");
		}
	}

	public void subir(){
		if (despegado == true) {
			z++;
		}else{
			System.out.println("Arranca el vehiculo");
		}
	}

	public void subir(int n){
		if (despegado == true) {
			z += n;
		}else{
			System.out.println("Arranca el vehiculo");
		}
	}

	public void bajar(){
		if (despegado == true && z > 0) {
			z--;
		}
	}

	public void bajar(int n){
		if (despegado == true && z > 0) {
			z -= n;
			if( z < 0 ){
				z = 0;
			}
		}
	}

	public void imprimeEstado(){
		super.imprimeEstado();
		System.out.println("Es un avion");
		if (despegado == true) {
			System.out.println("En el aire");
		}else{
			System.out.println("Es la tierra");
		}
		System.out.println("Altura: " + z);
	}


}