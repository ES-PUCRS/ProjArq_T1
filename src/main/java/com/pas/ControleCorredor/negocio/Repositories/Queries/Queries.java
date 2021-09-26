package com.pas.ControleCorredor.negocio.Repositories.Queries;

public class Queries {

    public static final String mediana =
        " SELECT * FROM ( "
        +        " SELECT "
        +        " ROW_NUMBER() OVER (ORDER BY MEDIA_TEMPO ASC) AS rownumber, "
        +        " * "
        +        " FROM EVENTOS "
        +" ) AS query "
        +" WHERE rownumber = :mediana";

    public static final String performance =
        " SELECT "
        +   " * "
        +   " FROM EVENTOS "
        + " WHERE ano = :ano "
        + " AND   distancia = :distancia";
}
