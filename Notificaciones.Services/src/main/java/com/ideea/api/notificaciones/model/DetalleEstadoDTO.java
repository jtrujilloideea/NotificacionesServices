package com.ideea.api.notificaciones.model;

public class DetalleEstadoDTO {
	
	private TipoNotificacion tipoNotificacion;
	private String messageId;
	private String estado;
	private String msgError;

	public DetalleEstadoDTO() {
		super();
	}

	public DetalleEstadoDTO(TipoNotificacion tipoNotificacion, String messageId, String estado, String msgError) {
		super();
		this.tipoNotificacion = tipoNotificacion;
		this.messageId = messageId;
		this.estado = estado;
		this.msgError = msgError;
	}

	public TipoNotificacion getTipoNotificacion() {
		return tipoNotificacion;
	}

	public void setTipoNotificacion(TipoNotificacion tipoNotificacion) {
		this.tipoNotificacion = tipoNotificacion;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMsgError() {
		return msgError;
	}

	public void setMsgError(String msgError) {
		this.msgError = msgError;
	}
		
	
}
