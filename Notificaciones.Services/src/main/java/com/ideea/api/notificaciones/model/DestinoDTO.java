package com.ideea.api.notificaciones.model;

import java.util.List;

public class DestinoDTO {
	
	private int seqMsg;
	private TipoNotificacion tipoNotificacion;
	private int tipoIdentificacion;
	private long identificacion;
	private String celular;
	private String email;
	private ProductoAsociadoDTO productoAsociado;
	private List<TagDTO> tags;  
    private List<AdjuntoDTO> adjuntos;
	        
    public DestinoDTO() {
		super();
	}

	public DestinoDTO(int seqMsg, TipoNotificacion tipoNotificacion, int tipoIdentificacion, long identificacion, String celular,
			String email, ProductoAsociadoDTO productoAsociado, List<TagDTO> tags, List<AdjuntoDTO> adjuntos) {
		super();
		this.seqMsg = seqMsg;
		this.tipoNotificacion = tipoNotificacion;
		this.tipoIdentificacion = tipoIdentificacion;
		this.identificacion = identificacion;
		this.celular = celular;
		this.email = email;
		this.productoAsociado = productoAsociado;
		this.tags = tags;
		this.adjuntos = adjuntos;
	}

	public int getSeqMsg() {
		return seqMsg;
	}

	public void setSeqMsg(int seqMsg) {
		this.seqMsg = seqMsg;
	}

	public TipoNotificacion getTipoNotificacion() {
		return tipoNotificacion;
	}

	public void setTipoNotificacion(TipoNotificacion tipoNotificacion) {
		this.tipoNotificacion = tipoNotificacion;
	}

	public int getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(int tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public long getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(long identificacion) {
		this.identificacion = identificacion;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ProductoAsociadoDTO getProductoAsociado() {
		return productoAsociado;
	}

	public void setProductoAsociado(ProductoAsociadoDTO productoAsociado) {
		this.productoAsociado = productoAsociado;
	}

	public List<TagDTO> getTags() {
		return tags;
	}

	public void setTags(List<TagDTO> tags) {
		this.tags = tags;
	}

	public List<AdjuntoDTO> getAdjuntos() {
		return adjuntos;
	}

	public void setAdjuntos(List<AdjuntoDTO> adjuntos) {
		this.adjuntos = adjuntos;
	}
    
    
}
