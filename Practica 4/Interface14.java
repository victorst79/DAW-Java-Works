import java.awt.*;
import java.awt.event.*;
public class Interface14 extends Frame{

	private PopupMenu popup;
	private Panel p;

	public Interface14(String titulo){
		super(titulo);

		// Creacion Paneles y Menu
		popup = new PopupMenu();
		p = new Panel();

		// Creacion Componentes e Inserccion
		add(p);
		MenuItem m1 = new MenuItem("Copiar  ");
		popup.add(m1);
		MenuItem m2 = new MenuItem("Cortar  ");
		popup.add(m2);
		MenuItem m3 = new MenuItem("Pegar  ");
		popup.add(m3);
		p.add(popup);

		// Listener
		addWindowListener( new ControlVentana() );
		p.addMouseListener( new ControlMouse() );
	}

	// Control Mouse
	class ControlMouse extends MouseAdapter{
		public void mouseReleased( MouseEvent me ){
			if ( me.getButton() == me.BUTTON3 ) {
				popup.show(p, me.getX(), me.getY() );
			}
		}
	}

	// Control Window
	class ControlVentana extends WindowAdapter{
		public void windowClosing( WindowEvent we ){
			System.exit(0);
		}
	}
}