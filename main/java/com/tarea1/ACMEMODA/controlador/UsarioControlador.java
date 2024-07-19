package com.tarea1.ACMEMODA.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.tarea1.ACMEMODA.modelo.Usuario;
import com.tarea1.ACMEMODA.servicio.IUsuarioServicio;


@Controller
public class UsarioControlador {
	@Autowired
  	public IUsuarioServicio servicioUsuario;

//Nuevo
	@GetMapping ("/nuevocurso")
	public String crearUsuario(Model model) {
		model.addAttribute("nuevoUsuario", new Usuario());
		return "/acmemoda/usuario";
	}
	
	
//Listar
	@GetMapping ("/listarusuario")
	public String listarUsuarios(Model model) {
		List<Usuario> listarUsuarios= servicioUsuario.listaUsuario();
		model.addAttribute("list", listarUsuarios);
		return "/acmemoda/listarusuario";
	}
	
		
//guardar
	@PostMapping("/insertarusuario")
	public String guardarusuario(@ModelAttribute("nuevoUsuario")Usuario nuevoUsuario) {
		servicioUsuario.insertarUsuario(nuevoUsuario);
		return "redirect:/listarusuario";
	}
		
//editar
	@GetMapping("editarUsuario/{idusuario}")
	public String editarUsuario(@PathVariable(value="idusuario") int idUsuario, Model model) {
		Usuario usuariorecuperado=servicioUsuario.buscarUsuarioId(idUsuario);
		model.addAttribute("nuevoUsuario", usuariorecuperado);
		return "redirect:/listarcuros";
	}
		
//eliminar
	public String eliminarUsuario(@PathVariable(value="idusuario")int idUsuario, Model model) {
		servicioUsuario.eliminarUsuario(idUsuario);
		return "redirect:/listarusuario";
	}
	
	
}
