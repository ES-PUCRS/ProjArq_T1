package com.pas.ControleCorredor.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pas.ControleCorredor.Entities.CorredorEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface CorredorRepository extends JpaRepository<CorredorEntity, Long> {

}
