package com.pas.ControleCorredor.Repositories;

import com.pas.ControleCorredor.Repositories.Queries.Queries;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pas.ControleCorredor.Entities.EventoEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface EventoRepository extends JpaRepository<EventoEntity, Long> {

    @Query(
        value = Queries.mediana,
        nativeQuery = true
    )
    EventoEntity findByMediana(@Param("mediana") int mediana);

    @Query(
            value = Queries.performance,
            nativeQuery = true
    )
    List<EventoEntity> findByYearAndDistance(
        @Param("ano") int ano,
        @Param("distancia") int distancia
    );
}
