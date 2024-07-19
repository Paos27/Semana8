package com.tarea1.ACMEMODA.modelo;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

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
@Table(name = "tb_pedido")
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPedido;
	private Date fechaCreacion;
	private boolean estado;
	@ManyToOne 
	@JoinColumn (name="id_Usuario")
	private Usuario fkUsuario;
	@OneToMany (mappedBy ="fkPedido")
	private List<DetPedido> listaDetPedido =new ArrayList<>();
	
	
}
