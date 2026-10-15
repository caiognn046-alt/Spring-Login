package com.veio.demo.service;

import org.springframework.stereotype.Service;

import com.veio.demo.entities.Usuario;
@Service
public class loginService {
   
	public boolean validarLogin(Usuario usuario) {
		return"admin".equals(usuario.getUsername())&&"1234".equals(usuario.getPassword());
	}
}
