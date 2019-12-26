package com.example.bdm.tiendaenlinea.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.example.bdm.tiendaenlinea.entity.ClienteEntity;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;


@Repository
public class RegistroDao {

	public boolean registrarCliente() {
		ArrayList<ClienteEntity> clientes = new ArrayList<ClienteEntity>();
		clientes.add(new ClienteEntity("Angel", "Paloalto","Parra","angel@gmail.com","1234"));
		clientes.add(new ClienteEntity("Angel", "Palo","Parra","lalal@gmail.com","12"));
		
		try {
			MongoClient mongoClient = new MongoClient("localhost", 27017);
			DB db = mongoClient.getDB("OnlineStore");
			DBCollection collection = db.getCollection("cliente");
			
			for (ClienteEntity clienteEntity : clientes) {
				WriteResult u = collection.insert(clienteEntity.toDbObjectCliente());
			}
			
			return true;
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	/*public void insertarCliente() {
		ClienteEntity clienteEntity = null;
		collection.insert(clienteEntity.toDbObjectCliente());
	}*/
	
}
