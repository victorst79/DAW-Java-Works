public class Pila extends Lista{
	public Pila(){
		super();
	}

	public Pila(Object ob){
		super(ob);
	}

	public void pop(){
		if (!vacia()) {
			Object ob = lastElement();
			removeElementAt(size()-1);			
		}
	}

	public void push(Object ob){
		addElement(ob);
	}

	public boolean vacia(){
		return isEmpty();
	}

	public Object cima(){
		return lastElement();
	}
}