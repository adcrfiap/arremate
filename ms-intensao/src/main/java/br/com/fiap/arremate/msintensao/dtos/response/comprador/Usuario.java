package br.com.fiap.arremate.msintensao.dtos.response.comprador;

import lombok.Data;

@Data
public class Usuario {

    private String id;

    private String usuario;

    private String email;

    private String senha;
}
