package com.tarea1.ACMEMODA.servicio;

import java.util.List;

import com.tarea1.ACMEMODA.modelo.DetPedido;



public interface IDetPedidoServicio {

	public void DetPedido(DetPedido nuevoDetPedido);
	public void actualizarCliente(DetPedido editarDetPedido);
	public List<DetPedido> listarDetPedido();
}
