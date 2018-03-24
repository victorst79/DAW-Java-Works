import java.awt.*;
import java.awt.event.*;

public class Interface07 extends Frame{

	private MenuItem mi1,mi2,mi3,mi4;
	private Menu menu1,menu2,menu3;
	private MenuBar mb;

	public Interface07(String titulo){
		super(titulo);
		
		mb = new MenuBar();
		setMenuBar(mb);
		menu1 = new Menu("Entrada 1");
		menu2 = new Menu("Entrada 2");
		menu3 = new Menu("Ayuda");

		mb.add(menu1);
		mb.add(menu2);
		mb.add(menu3);

		mi1 = new MenuItem("SubEntrada 1-1");
		menu1.add(mi1);
		// CREADOR DE SEPARADOR
		menu1.addSeparator();

		mi2 = new MenuItem("SubEntrada 1-2", new MenuShortcut(KeyEvent.VK_E));
		menu1.add(mi2);
		menu3 = new Menu("SubEntrada 1-3");
		menu1.add(menu3);
		mi3 = new MenuItem("SubEntrada 1-3-1");
		menu3.add(mi3);
		mi4 = new MenuItem("SubEntrada 1-3-2");
		menu3.add(mi4);
	}
}