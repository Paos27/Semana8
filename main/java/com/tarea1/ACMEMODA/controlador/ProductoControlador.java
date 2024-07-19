package com.tarea1.ACMEMODA.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.tarea1.ACMEMODA.modelo.Productos;
import com.tarea1.ACMEMODA.servicio.IProductosServicio;
@Controller
public class ProductoControlador {

	@Autowired
  	public IProductosServicio servicioProducto;

//Nuevo
	@GetMapping ("/nuevoproducto")
	public String crearProducto(Model model) {
		model.addAttribute("nuevoProducto", new Productos());
		return "/acmemoda/productos";
	}
	
	
//Listar
	@GetMapping ("/listarproducto")
	public String listarProductos(Model model) {
		List<Productos> listarProducto= servicioProducto.listarProductos();
		model.addAttribute("list", listarProducto);
		return "/acmemoda/listarproductos";
	}
	
		
//guardar
	@PostMapping("/insertarproducto")
	public String guardarProducto(@ModelAttribute("nuevoProducto")Productos nuevoProducto) {
		servicioProducto.insertarProductos(nuevoProducto);
		return "redirect:/listarproducto";
	}
		
//editar
	@GetMapping("/editarProducto/{idproducto}")
	public String editarProducto(@PathVariable(value="idproducto") int idProducto, Model model) {
		Productos productorecuperado= servicioProducto.buscarProductoId(idProducto);
		model.addAttribute("nuevoProducto", productorecuperado);
		return "/acmemoda/productos";
		
	}
		
//eliminar
	@GetMapping("/eliminarproducto/{idproducto}")
	public String eliminarProducto(@PathVariable(value="idproducto")int idProducto, Model model) {
		servicioProducto.eliminarProducto(idProducto);
		return "redirect:/listarproducto";
	}
	
	
}
