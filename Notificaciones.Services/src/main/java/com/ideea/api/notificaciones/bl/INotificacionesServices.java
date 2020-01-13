package com.ideea.api.notificaciones.bl;

import com.ideea.api.notificaciones.model.NotificacionesServicesDTO;
import com.ideea.api.notificaciones.model.NotificacionesServicesResDTO;

public interface INotificacionesServices {

	public NotificacionesServicesResDTO enviarNotifica(NotificacionesServicesDTO notificacion);
}
