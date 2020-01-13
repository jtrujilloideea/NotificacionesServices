package com.ideea.api.notificaciones.model;

public class AdjuntoDTO {

	private String nombre;
	private byte[] data;
	
	public AdjuntoDTO() {
		super();
	}

	public AdjuntoDTO(String nombre, byte[] data) {
		super();
		this.nombre = nombre;
		this.data = data;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(String data) {		
		this.data = data.getBytes();
	}
	
	
}
