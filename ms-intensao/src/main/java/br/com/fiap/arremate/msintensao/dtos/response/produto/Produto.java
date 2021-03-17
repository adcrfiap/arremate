package br.com.fiap.arremate.msintensao.dtos.response.produto;

import lombok.Data;

@Data
public class Produto {

    private String id;

    private String nome;

    private Categoria categoria;

    private Marca marca;

    private Modelo modelo;

}
