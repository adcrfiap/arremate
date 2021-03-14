package br.com.fiap.arremate.msproduto.services;

import br.com.fiap.arremate.msproduto.dtos.ProdutoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProdutoService {

    ProdutoDTO cadastrar(ProdutoDTO produtoDTO);

    ProdutoDTO atualizar(ProdutoDTO produtoDTO);

    void excluir(Long idProduto);

    ProdutoDTO pesquisarPorId(Long idProduto);

    List<ProdutoDTO> listarTodos();
}
