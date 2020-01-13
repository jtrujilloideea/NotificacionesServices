package com.ideea.api.notificaciones.model;

public class ProductoAsociadoDTO {
	
	private int codigoFideicomiso;
	private int encargo;
	
	public ProductoAsociadoDTO() {
		super();
	}

	public ProductoAsociadoDTO(int codigoFideicomiso, int encargo) {
		super();
		this.codigoFideicomiso = codigoFideicomiso;
		this.encargo = encargo;
	}

	public int getCodigoFideicomiso() {
		return codigoFideicomiso;
	}

	public void setCodigoFideicomiso(int codigoFideicomiso) {
		this.codigoFideicomiso = codigoFideicomiso;
	}

	public int getEncargo() {
		return encargo;
	}

	public void setEncargo(int encargo) {
		this.encargo = encargo;
	}
	
	
}
