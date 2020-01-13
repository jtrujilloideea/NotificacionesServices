package com.ideea.api.notificaciones.model;

import java.util.List;

public class ResultadoDTO {
	
	private int seqMsg;
	private List<DetalleEstadoDTO> detalleEstados;
		
	public ResultadoDTO() {
		super();
	}

	public ResultadoDTO(int seqMsg, List<DetalleEstadoDTO> detalleEstados) {
		super();
		this.seqMsg = seqMsg;
		this.detalleEstados = detalleEstados;
	}

	public int getSeqMsg() {
		return seqMsg;
	}


	public void setSeqMsg(int seqMsg) {
		this.seqMsg = seqMsg;
	}


	public List<DetalleEstadoDTO> getDetalleEstados() {
		return detalleEstados;
	}


	public void setDetalleEstados(List<DetalleEstadoDTO> detalleEstados) {
		this.detalleEstados = detalleEstados;
	}	
	
}
