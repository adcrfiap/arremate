package br.com.fiap.arremate.msintensao.entities;

import br.com.fiap.arremate.msintensao.entities.comprador.Comprador;
import br.com.fiap.arremate.msintensao.entities.produto.Produto;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Document(collection = "intensoes")
public class Intensao {

    @Id
    private String id;

    private Produto produto;

    private String descricao;

    private BigDecimal valorEstimado;

    private Comprador comprador;

    @CreatedDate
    private Date date;

}
