package br.com.fiap.arremate.msintensao.entities.comprador;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "contatos")
public class Contato {

    @Id
    private String id;

    private String telefone;

    private String celular;

    private String email;
}
