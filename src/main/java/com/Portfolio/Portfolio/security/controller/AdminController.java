
package com.Portfolio.Portfolio.security.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin()
public class AdminController {
    @GetMapping({ "/api/experiencia/create" })
	public String hello() {
		// Este endpoint respondera solo si el usuario que realiza el request esta
		// autenticado.
		// Para ejecutar este endpoint es necesario enviar un token JWT valido.
		return "¡Hola desde Argentina Programa!";
	}
}
