public class CocheAcuatico extends Coche implements Sumergible{
	protected double z;
	protected String medio;
	protected boolean estado_inmersion;

	public CocheAcuatico(String modelo,String matricula, String color){
		super(modelo,matricula,color);
		z = 0;
		medio = "Tierra";
		estado_inmersion = false;
	}

	public boolean estaInmarso(){
		if ( estado_inmersion == true ) {
			return true;
		}else{
			return false;
		}
	}

	public boolean estaEnElAgua(){
		if ( medio == "Agua") {
			return true;
		}else{
			return false;
		}
	}

	public void imprimeEstado(){
		super.imprimeEstado();
		if (estado_inmersion == true ) {
			System.out.println("El coche esta inmerso");
		}else{
			System.out.println("El coche no esta inmerso");
		}
		System.out.println("Se encuentra en " + medio);
		System.out.println("Y esta en " + z + " metros");
	}

	public void cambioDeMedio(){
		if ( z == 0) {
			if (medio == "Tierra" ) {
				medio = "Agua";
			}else{
				medio = "Tierra";
			}
		}
	}

	public void inmersion(){
		if ( arrancado == true ) {
			estado_inmersion = true;
			z = -1;
		}
	}

	public void ascender(int n){
		if ( medio == "Agua" && arrancado == true && estado_inmersion == true ) {
			z += n;
			if ( z == 0) {
				estado_inmersion = false;
			}
		}
	}

	public void descender(int n){
		if ( medio == "Agua" && arrancado == true && estado_inmersion == true ){
			z -= n;
		}
	}
}