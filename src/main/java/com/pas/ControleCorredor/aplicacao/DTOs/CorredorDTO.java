package com.pas.ControleCorredor.aplicacao.DTOs;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CorredorDTO {

    private String cpf;

    private String nome;

    private int diaDn;

    private int mesDn;

    private int anoDn;

    private String genero;

}
