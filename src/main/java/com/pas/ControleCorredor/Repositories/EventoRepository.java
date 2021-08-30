package com.pas.ControleCorredor.Repositories;

import com.pas.ControleCorredor.Repositories.Queries.Queries;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pas.ControleCorredor.Entities.EventoEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface EventoRepository extends JpaRepository<EventoEntity, Long> {

    @Query(
        value = Queries.mediana,
        nativeQuery = true
    )
    EventoEntity findByMediana(@Param("mediana") int mediana);
}
