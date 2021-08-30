package com.pas.ControleCorredor.Controllers;

import com.pas.ControleCorredor.DTOs.PerformanceDTO;
import com.pas.ControleCorredor.Services.PerformanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequiredArgsConstructor
public class PerformanceController {

    @Resource
    private PerformanceService service;

    @GetMapping("/aumentoPerformance")
    @CrossOrigin(origins = "*")
    public ResponseEntity<List<PerformanceDTO>> aumentoPerformance (@RequestParam final int distancia,
                                                                    @RequestParam final int ano ){
        return new ResponseEntity<>(service.findPerformance(distancia, ano), OK);
    }

}
