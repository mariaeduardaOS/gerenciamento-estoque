package com.gerenciamentoestoque.domain.exceptions;

public class ProdutoNaoEncontradoException extends EntidadeNaoEncontradaException
{
    private static final long serialVersionUID = 1L;
	public ProdutoNaoEncontradoException(String message)
	{
		super(message);
	}
    public ProdutoNaoEncontradoException(Long produtoId) {
      this(String.format("Não existe um cadastro de produto com código %d", produtoId));
    }
}
