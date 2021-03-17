package br.com.fiap.arremate.msintensao.dtos.response;

import br.com.fiap.arremate.msintensao.dtos.response.comprador.Comprador;
import br.com.fiap.arremate.msintensao.dtos.response.produto.Produto;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@Data
public class IntensaoResponseDTO {

    private Long idIntensao;

    private Produto produto;

    private String descricao;

    private BigDecimal valorEstimado;

    private Comprador comprador;

    private LocalDate data;
}
