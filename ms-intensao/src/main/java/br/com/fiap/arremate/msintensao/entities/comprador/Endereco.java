package br.com.fiap.arremate.msintensao.entities.comprador;

import lombok.Data;

@Data
public class Endereco {

    private String id;

    private String logradouro;

    private String numero;

    private String complemento;

    private String bairro;

    private String cep;

    private String cidade;

    private String estado;

}
