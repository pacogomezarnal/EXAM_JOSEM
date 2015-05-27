
package Vista;
import java.awt.*;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import model.ModeloCadetes;

import java.util.Iterator;

import model.ModeloCadetes;


public class Ventana2 extends JPanel {
	private JTextField nombre1;
	private JTextField apellidos1;
	private JTextField edad1;
	private JTextField nacionalidad1;
	private JTextField id1;
	ModeloCadetes ca;

	public Ventana2() {
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(115, 25, 46, 14);
		add(lblNombre);
		
		nombre1 = new JTextField();
		nombre1.setText("Nombre");
		nombre1.setBounds(115, 43, 86, 20);
		add(nombre1);
		nombre1.setColumns(10);
		
		JLabel lblApellidos = new JLabel("1er Apellido");
		lblApellidos.setBounds(115, 74, 86, 14);
		add(lblApellidos);
		
		apellidos1 = new JTextField();
		apellidos1.setBounds(115, 104, 86, 20);
		add(apellidos1);
		apellidos1.setColumns(10);
		
		JLabel lblEdad = new JLabel("2\u00BA Apellido");
		lblEdad.setBounds(115, 135, 86, 14);
		add(lblEdad);
		
		edad1 = new JTextField();
		edad1.setBounds(115, 160, 86, 20);
		add(edad1);
		edad1.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(115, 191, 75, 20);
		add(lblNacionalidad);
		
		nacionalidad1 = new JTextField();
		nacionalidad1.setBounds(115, 222, 86, 20);
		add(nacionalidad1);
		nacionalidad1.setColumns(10);
		
		JButton btnSiguiente = new JButton("Siguiente");
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
		
		JLabel lblEquipo = new JLabel("Equipo");
		lblEquipo.setBounds(10, 25, 46, 14);
		add(lblEquipo);
		
		/*
		JComboBox comboUsuario = new JComboBox();
		comboBox.setBounds(10, 43, 95, 20);
		add(comboBox);
		// Llenado del Combobox
		ca=new ModeloCadetes();
		Iterator<String> it = (Iterator<String>)ca.getusuarios().iterator();
		while (it.hasNext()){
			comboBox.addItem(it.next());
		}
		*/
		
		
		
		JButton btnSiguiente_1 = new JButton("Siguiente>>");
		btnSiguiente_1.setBounds(345, 266, 95, 23);
		add(btnSiguiente_1);
		
		JButton button = new JButton("<<Atras");
		button.setBounds(10, 266, 89, 23);
		add(button);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 53, 75, 20);
		add(comboBox);
		
		// TODO Auto-generated constructor stub
	}

	public void dispose() {
		// TODO Auto-generated method stub
		
	}
}
