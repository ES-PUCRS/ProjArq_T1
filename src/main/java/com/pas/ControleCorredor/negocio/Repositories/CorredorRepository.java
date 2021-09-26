package com.pas.ControleCorredor.negocio.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pas.ControleCorredor.negocio.Entities.CorredorEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface CorredorRepository extends JpaRepository<CorredorEntity, Long> {

}
