package com.pas.ControleCorredor.negocio.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pas.ControleCorredor.negocio.Entities.EstatisticaEntity;
import org.springframework.stereotype.Repository;

public interface EstatisticaRepository extends JpaRepository<EstatisticaEntity, Long> {
    
}
