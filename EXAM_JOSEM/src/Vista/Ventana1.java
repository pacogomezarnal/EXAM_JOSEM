
package Vista;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;




import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Ventana1 extends JPanel {
	private JTextField nombre1;
	private JTextField apellidos1;
	private JTextField edad1;
	private JTextField nacionalidad1;
	private JTextField id1;

	public Ventana1() {
		setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Ventana1.class.getResource("/Imagenes/img-usuario-tamano.png")));
		label.setBounds(10, 24, 95, 100);
		add(label);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(115, 25, 46, 14);
		add(lblNombre);
		
		nombre1 = new JTextField();
		nombre1.setText("Nombre");
		nombre1.setBounds(115, 43, 86, 20);
		add(nombre1);
		nombre1.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(115, 74, 46, 14);
		add(lblApellidos);
		
		apellidos1 = new JTextField();
		apellidos1.setText("Apellidos");
		apellidos1.setBounds(115, 104, 86, 20);
		add(apellidos1);
		apellidos1.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(115, 135, 46, 14);
		add(lblEdad);
		
		edad1 = new JTextField();
		edad1.setText("Edad");
		edad1.setBounds(115, 160, 86, 20);
		add(edad1);
		edad1.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(115, 191, 75, 20);
		add(lblNacionalidad);
		
		nacionalidad1 = new JTextField();
		nacionalidad1.setText("Nacionalidad");
		nacionalidad1.setBounds(115, 222, 86, 20);
		add(nacionalidad1);
		nacionalidad1.setColumns(10);
		
		
		JButton btnSiguiente = new JButton("Siguiente >>");
		btnSiguiente.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				Ventana2 Ventanasegunda = new Ventana2();
				Ventanasegunda.setVisible (true);
			}
		});
		
		/*
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("el raton fué clichado");
				Ventana2 VentPrinc = new Ventana2();
				VentPrinc.setVisible (true);
				Ventana1.this.dispose();
			}
		});
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});*/
		
		btnSiguiente.setBounds(351, 341, 89, 23);
		add(btnSiguiente);
		
		
		
		
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(273, 25, 46, 14);
		add(lblId);
		
		id1 = new JTextField();
		id1.setText("Id");
		id1.setBounds(273, 43, 86, 20);
		add(id1);
		id1.setColumns(10);
		// TODO Auto-generated constructor stub
	}

	protected void dispose() {
		// TODO Auto-generated method stub
		
	}
}
