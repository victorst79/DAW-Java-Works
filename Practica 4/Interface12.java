import java.awt.*;
import java.awt.event.*;
public class Interface12 extends Frame{
	TextArea tx1, tx2;

	public Interface12(String titulo){
		super(titulo);
		setLayout( new GridLayout(2,1) );
		tx1 = new TextArea(25,50);
		tx1.setEditable(true);
		tx2 = new TextArea(25,50);
		tx2.setEditable(false);
		add(tx1);
		add(tx2);
		addWindowListener( new ControlVentana() );
		tx1.addKeyListener( new ControlTeclado() );
	}

	// Control Teclado
	class ControlTeclado extends KeyAdapter{
		public void keyPressed( KeyEvent ke){
			if ( ke.getKeyChar() == 8 ) {
				tx2.replaceRange("", tx2.getCaretPosition(), tx2.getCaretPosition() -1);
			}else{
				if ( ke.getKeyChar()>=0 && ke.getKeyChar()<256 && ke.getKeyChar() != 27 && ke.getKeyChar() != 127 ) {
					tx2.append( ""+ke.getKeyChar() );
				}				
			}
		}
	}

	// Controlador Ventana Window
	class ControlVentana extends WindowAdapter{
	public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}
}