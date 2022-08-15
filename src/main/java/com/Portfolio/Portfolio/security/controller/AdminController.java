
package com.Portfolio.Portfolio.security.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT, RequestMethod.PATCH})
public class AdminController {
    @GetMapping({ "/api" })
	public String hello() {
		// Este endpoint respondera solo si el usuario que realiza el request esta
		// autenticado.
		// Para ejecutar este endpoint es necesario enviar un token JWT valido.
		return "¡Hola desde Argentina Programa!";
	}
}
