public class Cola extends Lista{
	public Cola(){
		super();
	}

	public Cola(Object ob){
		super(ob);
	}

	public void extraeDeCola(){
		extraeUltimo();
	}

	public void ponEnCola(Object ob){
		ponPrimero(ob);
	}

	public boolean vacia(){
		return isEmpty();
	}

	public Object frente(){
		return lastElement();
	}
}