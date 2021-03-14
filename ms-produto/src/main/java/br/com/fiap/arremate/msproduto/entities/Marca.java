package br.com.fiap.arremate.msproduto.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "marcas")
public class Marca {

    @Id
    private String id;

    private String nome;
}
