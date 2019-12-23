package com.example.bdm.tiendaenlinea.dao;


import java.net.ConnectException;
import java.net.UnknownHostException;

import org.springframework.stereotype.Component;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoSocketOpenException;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;


@Component
public class Conexion {
	
	DBCollection collection;				//Variable para una colección de mongo
	//private static final String SERVER = "10.95.71.56:27017";
	//private static final String ENDPOINT = "/registro";
	//private static final String URI =  SERVER + "/api/bdm-tiendaenlinea" + ENDPOINT;
	public void conexion() { 
		
	try {
		MongoClient client = new MongoClient("localhost", 27017);
		
		//Mongo mongo = new Mongo("localho", 8080);
		
		DB db = client.getDB("OnlineStore");
		
			//collection = db.getCollection("cliente");		//Toma la variable el valor de la colección cliente de nuestra BD
		System.out.println("Se realizo la conexión correctamente");
		
	} catch (Exception e) {
		System.out.println("Por qué no entra WTF");
		System.out.println("No se pudo realizar la conexión");
	}
	
	}
	
	/*public Boolean inserta(String a) {					//Metodo para hacer una insercion a la BD
		BasicDBObject document = new BasicDBObject();		//Se crea un objeto para hacer de tipo BasicDB para poder guardar en mongo
		document.put("nombre", a);							//con el .put se inserta tu entrada al campo que se necesite ej. nombre
		collection.insert(document);						//Se inserta el documento guardado en la linea anterior a nuestra coleccion 
		return true;
	}*/
	
}
