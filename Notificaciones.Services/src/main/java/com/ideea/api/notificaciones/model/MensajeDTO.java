package com.ideea.api.notificaciones.model;

public class MensajeDTO {
	
	private String asunto;
	private String mensajeHtml;	
	
	public MensajeDTO() {
		super();
	}

	public MensajeDTO(String asunto, String mensajeHtml) {
		super();
		this.asunto = asunto;
		this.mensajeHtml = mensajeHtml;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getMensajeHtml() {
		return mensajeHtml;
	}

	public void setMensajeHtml(String mensajeHtml) {
		this.mensajeHtml = mensajeHtml;
	}		
		
}
