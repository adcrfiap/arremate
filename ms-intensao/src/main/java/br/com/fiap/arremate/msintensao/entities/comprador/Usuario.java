package br.com.fiap.arremate.msintensao.entities.comprador;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "usuarios")
public class Usuario {

    @Id
    private String id;

    private String usuario;

    private String email;

    private String senha;
}
