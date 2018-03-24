import java.awt.*;
import java.awt.event.*;
public class Interface13 extends Frame{

	private Panel panel;
	private TextArea txa;

	public Interface13(String titulo){
		super(titulo);

		setLayout( new GridLayout(2,1) );

		// Creacion de Componentes
		panel = new Panel();
		txa = new TextArea(25,50);
		txa.setEditable(false);
		panel.setBackground(Color.PINK);
		// Inserccion Componentes
		add( panel );
		add( txa );

		// Listeners
		addWindowListener( new ControlVentana() );
		panel.addMouseListener( new ControlMouse() );
		panel.addMouseMotionListener( new ControlPosicion() );
	}

	// Control Mouse
	class ControlMouse implements MouseListener{
		public void mouseClicked( MouseEvent me ){
			txa.append("El mouse ha sido clickado \n");
		}

		public void mouseEntered( MouseEvent me ){
			txa.append("El mouse ha entrado en el panel \n");
		}

		public void mouseExited( MouseEvent me ){
			txa.append("El mouse ha salido del panel \n");
		}

		public void mousePressed( MouseEvent me){
			int boton = me.getButton();
			// int boton = me.getComponent();
			if (boton == me.BUTTON1 ) {
				txa.append("El mouse ha sido presionado(Boton Izquierdo) \n");
			}else if (boton == me.BUTTON2 ) {
				txa.append("El mouse ha sido presionado(Rueda) \n");
			}else if (boton == me.BUTTON3 ) {
				txa.append("El mouse ha sido presionado(Boton Derecho) \n");
			}else{
				txa.append("El mouse ha sido presionado(Boton Adicional) \n");
			}
			
		}

		public void mouseReleased( MouseEvent me){
			txa.append("El mouse ha sido liberado \n");
		}
	}

	// Control Mouse Posicion
	class ControlPosicion implements MouseMotionListener{
		public void mouseMoved( MouseEvent me){
		    txa.append("Posicion x: " + me.getPoint().getX() + " Posicion y: "+ me.getPoint().getY() +"\n");
		}

		public void mouseDragged( MouseEvent me){
			txa.append("Componente arrastrado \n");
		}
	}

	// Control Window
	class ControlVentana extends WindowAdapter{
		public void windowClosing( WindowEvent we ){
			System.exit(0);
		}
	}

}