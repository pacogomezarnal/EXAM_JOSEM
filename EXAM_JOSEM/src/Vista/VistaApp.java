


package Vista;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;



public class VistaApp extends JFrame {
	private Ventana1 contenedorVista;

	//private VistaPrincipal contenedorVista;

	public VistaApp() {
		setAutoRequestFocus(false);
		setTitle("THE LABY");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 443);
		getContentPane().setLayout(new CardLayout(0, 0));
		
		contenedorVista= new Ventana1();
		setContentPane(contenedorVista);
		/* BORRAR
		contenedorVista= new VistaPrincipal();
		setContentPane(contenedorVista);*/

		// TODO Auto-generated constructor stub
	}

}
