package com.ideea.api.notificaciones.ws;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ideea.api.notificaciones.bl.NotificacionesServices;
import com.ideea.api.notificaciones.model.NotificacionesServicesDTO;
import com.ideea.api.notificaciones.model.NotificacionesServicesResDTO;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/NotificacionesServices/")
public class NotificacionesManagement {
	
	@Autowired
	private NotificacionesServices notificarDao;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "EnviarNotificacion", method = RequestMethod.POST)
	public ResponseEntity<NotificacionesServicesResDTO> enviarNotificacion(@Valid @RequestBody NotificacionesServicesDTO notificacion) {			
		
		NotificacionesServicesResDTO respuesta = notificarDao.enviarNotifica(notificacion);
		
		return new ResponseEntity(respuesta, HttpStatus.OK);
	}
}
