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
@Table(name = "tb_detalle")
public class DetPedido implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	int idDetPedido;
	private String cantidad;
	private String fechaCreacion;
	private String pTotal;
	@Column(nullable = true)
	private String estado;
	@ManyToOne 
	@JoinColumn (name="id_Pedido")
	private Pedido fkPedido;
	@OneToMany(mappedBy ="fkDetPedido")
	private List<Productos> listaProducto =new ArrayList<>();
}
