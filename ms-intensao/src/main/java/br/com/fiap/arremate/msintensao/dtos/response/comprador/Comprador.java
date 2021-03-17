package br.com.fiap.arremate.msintensao.dtos.response.comprador;

import lombok.Data;

@Data
public class Comprador {

    private String id;

    private String cpf;

    private String nome;

    private String sobreNome;

    private Usuario usuario;

    private Endereco endereco;

    private Contato contato;

}
