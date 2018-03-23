import java.awt.*;
public class Interface06 extends Frame{

	public Interface06(String titulo){
		super(titulo);

		ScrollPane spane = new ScrollPane(1);
		Panel numeros = new Panel();
		numeros.setLayout( new GridLayout(5,5) );
		for (int i = 1; i <= 25; i++) {
			numeros.add( new Button("Boton " + i) );
		}
		spane.add(numeros);
		add(spane);
	}
}