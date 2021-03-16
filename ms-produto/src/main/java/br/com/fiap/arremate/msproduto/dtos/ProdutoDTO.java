package br.com.fiap.arremate.msproduto.dtos;

import lombok.Data;

@Data
public class ProdutoDTO {

    private String id;

    private String nome;

    private CategoriaDTO categoria;

    private MarcaDTO marca;

    private ModeloDTO modelo;
}
