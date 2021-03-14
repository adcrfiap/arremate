package br.com.fiap.arremate.msproduto.services.impl;

import br.com.fiap.arremate.msproduto.dtos.ProdutoDTO;
import br.com.fiap.arremate.msproduto.repositories.ProdutoRepository;
import br.com.fiap.arremate.msproduto.services.ProdutoService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository produtoRepository;

    @Override
    public ProdutoDTO cadastrar(ProdutoDTO produtoDTO) {
        return null;
    }

    @Override
    public ProdutoDTO atualizar(ProdutoDTO produtoDTO) {
        return null;
    }

    @Override
    public void excluir(Long idProduto) {

    }

    @Override
    public ProdutoDTO pesquisarPorId(Long idProduto) {
        return null;
    }

    @Override
    public List<ProdutoDTO> listarTodos() {
        return null;
    }
}
