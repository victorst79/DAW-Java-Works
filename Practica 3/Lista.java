import java.util.*;
public class Lista extends Vector{
		
	public Lista(){
		super();
	}

	public Lista(Object ob){
		super();
		addElement(ob); // añade al final del vector siempre
	}

	public void ponPrimero(Object ob){
		insertElementAt(ob,0);
	}

	public void ponUltimo(Object ob){
		addElement(ob);
		// insertElementAt(ob,size() - 1);
	}

	public boolean estaVacia(){
		return isEmpty();
	}

	public Object extraePrimero(){
		Object ob = firstElement();
		removeElementAt(0);
		return ob;
	}

	public Object extraeUltimo(){
		Object ob = lastElement();
		removeElementAt(size() - 1);
		return ob;
	}

	public void visualizaElemento(){
		for (Enumeration e = elements(); e.hasMoreElements(); ) {
			System.out.println( e.nextElement() );
		}
	}

}