package com.ideea.api.notificaciones.model;

public class TagDTO {

	private String tag;
	private String valor;
	
	public TagDTO() {
		super();
	}

	public TagDTO(String tag, String valor) {
		super();
		this.tag = tag;
		this.valor = valor;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	
	
}
