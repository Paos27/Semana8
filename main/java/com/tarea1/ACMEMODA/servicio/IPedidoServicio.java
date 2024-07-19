package com.tarea1.ACMEMODA.servicio;

import java.util.List;

import com.tarea1.ACMEMODA.modelo.Pedido;

public interface IPedidoServicio {

	public void insertarPedido(Pedido nuevoPedido);
	public void actualizarPedido(Pedido editarPedido);
	public List<Pedido> listarPedido();
}
