public class Vehiculo{
	protected int x, y, direccion;
	protected boolean arrancado;

	//Norte = 0, Este = 1, Sur = 2, Oeste = 3
	public Vehiculo(int x, int y ,boolean arrancado,int direccion ){
		this.x = 0;
		this.y = 0;
		this.arrancado = arrancado;
		this.direccion = direccion;
	}

	public Vehiculo(){
		this(0,0,false,1);
	}

	public void parar(){
		arrancado = false;
	}

	public void arrancar(){
		arrancado = true;
	}

	public boolean estaArrancado(){
		return arrancado;
	}

	public void mover(){
		if ( estaArrancado() == true ) {
			switch( direccion ){
				case 0: y++; break;
				case 1: x++; break;
				case 2: y--; break;
				case 3: x--; break;
			}
		}else{
			System.out.println("El vehiculo no esta arrancado");
		}
	}
	
	public void mover(int n){
		if ( estaArrancado() == true ) {
			for(int i = 1; i <= n; n++){
				mover();
			}
		}else{
			System.out.println("El vehiculo no esta arrancado");
		}
	}

	public int getDireccion(){
		return direccion;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}

	public void imprimeEstado(){
		System.out.println("El vehiculo presenta los siguientes datos");
		System.out.println("Coordenadas X: " + getX() );
		System.out.println("Coordenadas Y: " + getY() );
		if ( estaArrancado() == true ) {
			System.out.println("El vehiculo esta arrancado");
		}else{
			System.out.println("El vehiculo no esta arrancado");
		}
		switch( direccion ){
			case 0: System.out.println("El vehiculo se dirige al Norte");break;
			case 1: System.out.println("El vehiculo se dirige al Este");break;
			case 2: System.out.println("El vehiculo se dirige al Sur");break;
			case 3: System.out.println("El vehiculo se dirige al Oeste");break;
		}

	}

	public void girarDerecha(){
		direccion++;
		if ( direccion == 4 ) {
			direccion = 0;
		}
	}

	public void girarIzquierda(){
		direccion--;
		if (direccion == -1) {
			direccion = 3;
		}
	}

	public void girar(int giro){
		if(giro > 0){
			for(int i = 1; i <= Math.abs(giro); i++){
				girarDerecha();
			}
		}else{
			for(int i = 1; i <= Math.abs(giro); i++){
				girarIzquierda();
			}
		}
	}
}