package com.tarea1.ACMEMODA.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "tb_producto")
public class Productos  implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idProducto;
	private String nombre;
	private String descripcion;
	private String precio;
	private String talla;
	private String marca;
	@Column(nullable = true)
	private String color;
	@ManyToOne
	@JoinColumn (name="id_Det_Pedido")
	private DetPedido fkDetPedido ;
	@ManyToOne
	@JoinColumn (name="id_Categoria")
	private Categoria fkCategoria;
	@ManyToOne
	@JoinColumn (name="id_Stock")
	private Stock fkStock;
	@OneToMany (mappedBy = "productos")
	private List<DetKardex> listDetalle =new ArrayList<>();
	
}
