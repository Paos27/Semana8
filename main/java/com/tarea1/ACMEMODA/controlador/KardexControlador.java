package com.tarea1.ACMEMODA.controlador;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.tarea1.ACMEMODA.modelo.Kardex;
import com.tarea1.ACMEMODA.servicio.IKardexServicio;
@Controller
public class KardexControlador {

	@Autowired
	IKardexServicio servicioKardex;
	
	
	//Nuevo
		@GetMapping ("/nuevokardex")
		public String crear(Model model) {
			model.addAttribute("nuevo", new Kardex());
			return "/kardex/kardex";
		}
		
		
	//Listar
		@GetMapping ("/listarkardex")
		public String listar(Model model) {
			List<Kardex> listar= servicioKardex.listarTodos();
			model.addAttribute("list", listar );
			return "/kardex/listarkardex";
		}
		
			
	//guardar
		@PostMapping("/insertarkardex")
		public String guardar(@ModelAttribute("nuevo")Kardex nuevo) {
			nuevo.setFechaMov(new Date());
			servicioKardex.insertar(nuevo);
			return "redirect:/listarkardex";
		}
			
	//editar
		@GetMapping("/editarKardex/{idkardex}")
		public String editar(@PathVariable(value="idkardex") int id, Model model) {
			Kardex kardexrecuperado=servicioKardex.buscarPorId(id);
			model.addAttribute("nuevo", kardexrecuperado);
			return "/kardex/kardex";
			
		}
			
	//eliminar
		@GetMapping("/eliminarkardex/{idkardex}")
		public String eliminar(@PathVariable(value="idkardex")int id, Model model) {
			servicioKardex.eliminar(id);
			return "redirect:/listarkardex";
		}
		
		
	
}
