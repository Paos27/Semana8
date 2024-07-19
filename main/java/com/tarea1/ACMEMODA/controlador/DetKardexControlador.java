package com.tarea1.ACMEMODA.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.tarea1.ACMEMODA.modelo.DetKardex;
import com.tarea1.ACMEMODA.servicio.IDetKardexServicio;
import com.tarea1.ACMEMODA.servicio.IKardexServicio;
import com.tarea1.ACMEMODA.servicio.IProductosServicio;

@Controller
public class DetKardexControlador {

	
	@Autowired
	private IDetKardexServicio servicioDet;
	@Autowired
	private IProductosServicio servicioProd;
	@Autowired
	private IKardexServicio servicioKardex;

	//Nuevo
		@GetMapping ("/nuevodet")
		public String crear(Model model) {
			model.addAttribute("nuevo", new DetKardex());
			model.addAttribute("productos", servicioProd.listarProductos());
			model.addAttribute("kardex", servicioKardex.listarTodos());
			return "/kardex/detkardex";
		}
		
		
	//Listar
		@GetMapping ("/listardet")
		public String listar(Model model) {
			List<DetKardex> listar= servicioDet.listarTodos();
			model.addAttribute("list", listar );
			return "/kardex/listardetalle";
		}
		
			
	//guardar
		@PostMapping("/insertardet")
		public String guardar(@ModelAttribute("nuevo") DetKardex nuevo) {
			servicioDet.insertar(nuevo);
			return "redirect:/listardet";
		}
			
	//editar
		@GetMapping("/editardet/{idDetalle}")
		public String editar(@PathVariable(value="idDetalle") int id, Model model) {
			DetKardex detallerecuperado=servicioDet.buscarPorId(id);
			model.addAttribute("nuevo", detallerecuperado);
			model.addAttribute("productos", servicioProd.listarProductos());
			model.addAttribute("kardex", servicioKardex.listarTodos());
			return "/kardex/detkardex";
			
		}
			
	//eliminar
		@GetMapping("/eliminardetalle/{idDetalle}")
		public String eliminar(@PathVariable(value="idDetalle")int id, Model model) {
			servicioDet.eliminar(id);
			return "redirect:/listarkardex";
		}
		
		
	
	
}



