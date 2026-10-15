package com.veio.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veio.demo.entities.Usuario;
import com.veio.demo.service.loginService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
 private loginService loginservice;
 
 public LoginController(loginService loginservice) {
	 this.loginservice = loginservice;
 }
 @PostMapping
  public ResponseEntity<String>longlin (@RequestBody Usuario usuario){
	  boolean isValid= loginservice.validarLogin(usuario);
	  if(isValid) {
		  return ResponseEntity.ok("Login bem sucedido");
	  }else {
		  return ResponseEntity.status(401).body("Credenciais invalidas");
	  }
  }
}
