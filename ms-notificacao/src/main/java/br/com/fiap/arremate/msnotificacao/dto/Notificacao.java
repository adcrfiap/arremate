package br.com.fiap.arremate.msnotificacao.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Notificacao{

    private Produto produto;

    private Comprador comprador;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate data;

}
