package com.pas.ControleCorredor.DTOs;

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
