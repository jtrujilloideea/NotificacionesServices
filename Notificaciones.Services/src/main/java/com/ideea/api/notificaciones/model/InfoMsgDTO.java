package com.ideea.api.notificaciones.model;

public class InfoMsgDTO {

	private String appId;
	private String nombreUsuario;
	private long identificacion;
	private String ip;
	
	public InfoMsgDTO() {
		super();
	}

	public InfoMsgDTO(String appId, String nombreUsuario, long identificacion, String ip) {
		super();
		this.appId = appId;
		this.nombreUsuario = nombreUsuario;
		this.identificacion = identificacion;
		this.ip = ip;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public long getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(long identificacion) {
		this.identificacion = identificacion;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
}
