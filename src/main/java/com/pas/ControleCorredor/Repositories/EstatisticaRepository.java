package com.pas.ControleCorredor.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pas.ControleCorredor.Entities.EstatisticaEntity;
import org.springframework.stereotype.Repository;

public interface EstatisticaRepository extends JpaRepository<EstatisticaEntity, Long> {
    
}
