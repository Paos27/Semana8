package com.tarea1.ACMEMODA.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.tarea1.ACMEMODA.modelo.Categoria;
import com.tarea1.ACMEMODA.servicio.ICategoriaServicio;

@Controller
public class CategoriaControlador {

	@Autowired
	private ICategoriaServicio servicioCategoria;
	
	
	//Nuevo
		@GetMapping ("/nuevocategoria")
		public String crearProducto(Model model) {
			model.addAttribute("nuevoCategoria", new Categoria());
			return "/categoria/categoria";
		}
		
	//listar
			@GetMapping("/listarcategoria")
			public String listarCategoria(Model model) {
				List<Categoria> listarCategoria=servicioCategoria.listarCategoria();
				model.addAttribute("list" , listarCategoria);
				return "/categoria/listarcategoria"; //ruta fisica de la pagina
			}
			
			//guardar
			@PostMapping("/insertarcategoria")
			public String guardarCategoria(@ModelAttribute("nuevaCategoria")Categoria nuevaCategoria) {
				servicioCategoria.insertarCategoria(nuevaCategoria);
				return "redirect:/listarcategoria";
			}
			
			//editar
			@GetMapping("/editarCategoria/{idcategoria}")
			public String editarCategoria(@PathVariable(value="idcategoria") int idCategoria, Model model) {
				Categoria categoriarecuperada=servicioCategoria.buscarId(idCategoria);
				model.addAttribute("nuevaCategoria", categoriarecuperada);
				return "/categoria/categoria";
			}
			
			//eliminar
			@GetMapping("/eliminarcategoria/{idcategoria}")
			public String eliminarCategoria(@PathVariable(value="idcategoria")int idCategoria, Model model) {
				servicioCategoria.eliminarCategoria(idCategoria);
				return "redirect:/listarcategoria";
			}
}
