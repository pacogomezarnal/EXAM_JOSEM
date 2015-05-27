package lib;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.ConexionDB;

//import modelo.ModeloUsuarios;
import Vista.VistaApp;



public class examenDBApp {


	public static void main(String[] args) {
		
		
		ConexionDB usuarios;
		//ModeloUsuarios mUsuarios;
		
		// Se crea la conexión.
		usuarios=new ConexionDB("91.121.110.152","thelaby","usuexamen","examinando");
		//usuarios=new ConexionBD("Localhost","gamedb","root","");
		// Comprobamos que se ha podido conectar y lanza la ventana de vista.
		if (usuarios.connectDB()==true){
			System.out.println("Exito de conexión!!!");
			VistaApp vistaApp= new VistaApp();
			vistaApp.setVisible(true);
			JOptionPane.showMessageDialog (null, "Conectado con exito  a la BD "
					+ "\n ", "CONECTADO", JOptionPane.INFORMATION_MESSAGE);
			
			// TODO Auto-generated method stub
		}else{
			System.out.print("Fallo de conexión!!!");
		}
		
		
		
		

	}

}
