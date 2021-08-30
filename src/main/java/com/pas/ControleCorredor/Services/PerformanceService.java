package com.pas.ControleCorredor.Services;

import com.pas.ControleCorredor.DTOs.PerformanceDTO;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PerformanceService {

    public PerformanceDTO findPerformance(int distancia, int ano) {
        PerformanceDTO performance = PerformanceDTO.builder().build();
        //TODO - O evento deveria ser entrelaçado com o corredor?
        return performance;
    }

}
