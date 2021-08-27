package com.pas.ControleCorredor.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pas.ControleCorredor.Entities.EventoEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<EventoEntity, Long> {

}
