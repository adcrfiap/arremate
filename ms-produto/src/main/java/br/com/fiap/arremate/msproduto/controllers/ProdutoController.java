package br.com.fiap.arremate.msproduto.controllers;

import br.com.fiap.arremate.msproduto.dtos.ProdutoDTO;
import br.com.fiap.arremate.msproduto.services.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<ProdutoDTO> cadastrar(@RequestBody ProdutoDTO produtoDTO) {
        return null;
    }

    @PutMapping
    public ResponseEntity<ProdutoDTO> atualizar(@RequestBody ProdutoDTO produtoDTO) {
        return null;
    }

    @DeleteMapping("/{idProduto}")
    public ResponseEntity<Void> excluir(@PathVariable Long idProduto) {
        return null;
    }

    @GetMapping("/{idProduto}")
    public ResponseEntity<ProdutoDTO> pesquisarPorId(@PathVariable Long idProduto) {
        return null;
    }

    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> listarTodos() {
        return null;
    }
}
