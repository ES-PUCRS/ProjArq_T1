/* CREATE TABLES */

CREATE TABLE IF NOT EXISTS CORREDORES (
    CPF VARCHAR(255),
    NOME VARCHAR(255),
    GENERO VARCHAR(255),
    DIADN int,
    MESDN int,
    ANODN int,

    PRIMARY KEY(cpf)
);


CREATE TABLE IF NOT EXISTS EVENTOS (
    ID int,
    NOME VARCHAR(255),
    DIA int,
    MES int,
    ANO int,
    DISTANCIA int,
    HORAS int,
    MINUTOS int,
    SEGUNDOS int,

    PRIMARY KEY(id)
);