package br.com.fiap.arremate.msintensao.entities.comprador;

import lombok.Data;

@Data
public class Usuario {

    private String id;

    private String usuario;

    private String email;

    private String senha;
}
