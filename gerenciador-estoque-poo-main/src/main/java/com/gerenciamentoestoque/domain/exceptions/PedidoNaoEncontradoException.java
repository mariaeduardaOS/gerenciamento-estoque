package com.gerenciamentoestoque.domain.exceptions;

public class PedidoNaoEncontradoException extends EntidadeNaoEncontradaException
{
	private static final long serialVersionUID = 1L;
	public PedidoNaoEncontradoException(String message)
	{
		super(message);
	}
	public PedidoNaoEncontradoException(Long pedidoId)
	{
		this(String.format("Não existe um cadastro de pedido com código %d", pedidoId));
	}
}
