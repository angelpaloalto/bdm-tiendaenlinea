package com.example.bdm.tiendaenlinea.entity;

import com.mongodb.BasicDBObject;

public class ClienteEntity {
	
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String correo;
	private String password;
	
	public ClienteEntity() {
		
	}
	
	public ClienteEntity (String nombre, String apellidoPaterno, String apellidoMaterno, String correo, String password) {
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.correo = correo;
		this.password = password;
	}
	
	public ClienteEntity (BasicDBObject basicDBObject) {
		this.nombre = basicDBObject.getString("nombre");
		this.apellidoPaterno = basicDBObject.getString("apellidoPaterno");
		this.apellidoMaterno = basicDBObject.getString("apellidoMaterno");
		this.correo = basicDBObject.getString("correo");
		this.password = basicDBObject.getString("password");
	}
	
	public BasicDBObject toDbObjectCliente() {
		BasicDBObject dbObjectCliente = new BasicDBObject();
		
		dbObjectCliente.append("nombre", this.getNombre());
		dbObjectCliente.append("apellidoPaterno", this.getApellidoPaterno());
		dbObjectCliente.append("apellidoMaterno", this.getApellidoMaterno());
		dbObjectCliente.append("correo", this.getCorreo());
		dbObjectCliente.append("password", this.getPassword());
		
		return dbObjectCliente;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	public String toString() {
		return "Nombre: " + this.getNombre() + "\n" + "Apellido Paterno: " + this.getApellidoPaterno() + "\n" + "Apellido Materno: " + this.getApellidoMaterno()
		+ "\n" + "correo: " + this.getCorreo() + "\n" + "Contraseña: " + this.getPassword();
	}

}
