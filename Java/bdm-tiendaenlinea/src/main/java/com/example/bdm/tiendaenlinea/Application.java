package com.example.bdm.tiendaenlinea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.bdm.tiendaenlinea.dao.Conexion;
import com.example.bdm.tiendaenlinea.dao.RegistroDao;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		//Conexion conexion = new Conexion();
		RegistroDao registroDao = new RegistroDao();
		//conexion.conexion();			//Pruebas para saber si se realizo la conexión
		//conexion.inserta("la");		//Se invoca el metodo para hacer una insercion simple y ver que conecta correctamente a la BD
		registroDao.registrarCliente();
	}

}
