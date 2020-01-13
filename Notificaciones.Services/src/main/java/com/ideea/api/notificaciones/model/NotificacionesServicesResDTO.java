package com.ideea.api.notificaciones.model;

import java.util.List;

public class NotificacionesServicesResDTO {
	
	private int codigoRespuesta;
	private String mensajeError;
	private List<ResultadoDTO> resultado;
	
	
	public NotificacionesServicesResDTO() {
		super();
	}

	public NotificacionesServicesResDTO(int codigoRespuesta, String mensajeError, List<ResultadoDTO> resultado) {
		super();
		this.codigoRespuesta = codigoRespuesta;
		this.mensajeError = mensajeError;
		this.resultado = resultado;
	}

	public int getCodigoRespuesta() {
		return codigoRespuesta;
	}

	public void setCodigoRespuesta(int codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}

	public String getMensajeError() {
		return mensajeError;
	}

	public void setMensajeError(String mensajeError) {
		this.mensajeError = mensajeError;
	}

	public List<ResultadoDTO> getResultado() {
		return resultado;
	}

	public void setResultado(List<ResultadoDTO> resultado) {
		this.resultado = resultado;
	}
		
}
