package model;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.ResultSetMetaData;


public class ModeloCadetes {
	//DEVOLVER CORREDORES
	private static String id="SELECT id FROM cadetes";
	private static String nombre="SELECT nombre FROM cadetes";
	private static String apellidos="SELECT apellidos FROM cadetes";
	private static String equipo="SELECT equipo FROM cadetes";
	private static String nacionalidad="SELECT nacionalidad FROM cadetes";
	
	
	
	//Conexion
	private Connection conexion = null;// maneja la conexión
	Statement instruccion = null;
	ResultSet conjuntoResultados = null;
	
	
	//usuariosDB
	private ArrayList<String> usuarios=null;
	
	
	
	public ModeloCadetes() {
		conexion=ConexionDB.getConexion();
		usuarios= new ArrayList<String>();
	}
	
	
	
	public ArrayList getusuarios(){
		try{
			instruccion = this.conexion.createStatement();
			conjuntoResultados = instruccion.executeQuery(id);

			//Listaremos por pantalla los datos
			while( conjuntoResultados.next() ) {
				usuarios.add (conjuntoResultados.getString(id));
			}// fin de while
			return usuarios;
		}
		catch( SQLException excepcionSql ) 
		{
			excepcionSql.printStackTrace();
			return usuarios;
		}
		finally{
			try{
				conjuntoResultados.close();
				instruccion.close();

				//conexion.close();

			}
			catch( SQLException excepcionSql ) 
			{
				excepcionSql.printStackTrace();
			}
		}
	} 

}
