package br.com.fiap.arremate.msintensao.dtos.request;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class IntensaoDTO {

    private String idProduto;

    private String descricao;

    private BigDecimal valorEstimado;

    private String idComprador;

    @CreatedDate
    private Date date;
}
