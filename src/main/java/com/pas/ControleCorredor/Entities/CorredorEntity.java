package com.pas.ControleCorredor.Entities;


import javax.validation.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "CORREDORES")
public class CorredorEntity {

    @Id
    @NotEmpty
    @Column(name = "CPF")
    private String cpf;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "DIADN")
    private int diaDn;

    @Column(name = "MESDN")
    private int mesDn;

    @Column(name = "ANODN")
    private int anoDn;

    @Column(name = "GENERO")
    private String genero;

}