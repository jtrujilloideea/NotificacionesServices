package com.ideea.api.notificaciones.model;

import java.util.List;

public class NotificacionesServicesDTO {
	
	private List<DestinoDTO> destinos;
	private MensajeDTO mensaje;
	private List<AdjuntoDTO> adjuntos;
	private String mensajeCorto;
	private InfoMsgDTO infoMsg;
		
	public NotificacionesServicesDTO() {
		super();
	}

	public NotificacionesServicesDTO(List<DestinoDTO> destinos, MensajeDTO mensaje, List<AdjuntoDTO> adjuntos,
			String mensajeCorto, InfoMsgDTO infoMsg) {
		super();
		this.destinos = destinos;
		this.mensaje = mensaje;
		this.adjuntos = adjuntos;
		this.mensajeCorto = mensajeCorto;
		this.infoMsg = infoMsg;
	}

	public List<DestinoDTO> getDestinos() {
		return destinos;
	}

	public void setDestinos(List<DestinoDTO> destinos) {
		this.destinos = destinos;
	}

	public MensajeDTO getMensaje() {
		return mensaje;
	}

	public void setMensaje(MensajeDTO mensaje) {
		this.mensaje = mensaje;
	}

	public List<AdjuntoDTO> getAdjuntos() {
		return adjuntos;
	}

	public void setAdjuntos(List<AdjuntoDTO> adjuntos) {
		this.adjuntos = adjuntos;
	}

	public String getMensajeCorto() {
		return mensajeCorto;
	}

	public void setMensajeCorto(String mensajeCorto) {
		this.mensajeCorto = mensajeCorto;
	}

	public InfoMsgDTO getInfoMsg() {
		return infoMsg;
	}

	public void setInfoMsg(InfoMsgDTO infoMsg) {
		this.infoMsg = infoMsg;
	}	
	
}
