package com.ideea.api.notificaciones.bl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ideea.api.notificaciones.model.DetalleEstadoDTO;
import com.ideea.api.notificaciones.model.NotificacionesServicesDTO;
import com.ideea.api.notificaciones.model.NotificacionesServicesResDTO;
import com.ideea.api.notificaciones.model.ResultadoDTO;
import com.ideea.api.notificaciones.model.TipoNotificacion;

@Component
public class NotificacionesServices implements INotificacionesServices{
	
	/**
	 * Metodo que envia la notificacion a los destinos recibidos con mensajes Personalizados
	 * @param notificacion
	 */
	public NotificacionesServicesResDTO enviarNotifica(NotificacionesServicesDTO notificacion) {
		
		NotificacionesServicesResDTO variable = new NotificacionesServicesResDTO();
		List<ResultadoDTO> listaResultado = new ArrayList<ResultadoDTO>();				
		DetalleEstadoDTO detalle = new DetalleEstadoDTO();
		DetalleEstadoDTO detalle2 = new DetalleEstadoDTO();
		
		variable.setCodigoRespuesta(100);
		variable.setMensajeError("Mensaje de error General");
		
		ResultadoDTO result = new ResultadoDTO();
		List<DetalleEstadoDTO> detalleEst = new ArrayList<DetalleEstadoDTO>();
		detalle.setTipoNotificacion(TipoNotificacion.SMS);
		detalle.setMessageId("001054658012365");
		detalle.setEstado("PRO");
		detalle.setMsgError("Mensaje de error");
		detalleEst.add(0, detalle);
		DetalleEstadoDTO detalle1 = new DetalleEstadoDTO();
		detalle1.setTipoNotificacion(TipoNotificacion.EMAIL);
		detalle1.setMessageId("001054658057895");
		detalle1.setEstado("PRO");
		detalle1.setMsgError("Mensaje de error 2");
		detalleEst.add(1, detalle1);
		
		
		result.setSeqMsg(1);
		result.setDetalleEstados(detalleEst);
		listaResultado.add(0, result);
		
		ResultadoDTO result2 = new ResultadoDTO();
		List<DetalleEstadoDTO> detalleEst2 = new ArrayList<DetalleEstadoDTO>();
		detalle2.setTipoNotificacion(TipoNotificacion.EMAIL);
		detalle2.setMessageId("00106546542366");
		detalle2.setEstado("PRO");
		detalle2.setMsgError("Mensaje Programado");
		detalleEst2.add(detalle2);
				
		result2.setSeqMsg(2);
		result2.setDetalleEstados(detalleEst2);
		listaResultado.add(1, result2);	
		
		variable.setResultado(listaResultado);
		
		return variable;
	}
	
	
}
