package com.pas.ControleCorredor.Controllers;

import com.pas.ControleCorredor.Services.EstatisticaService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import com.pas.ControleCorredor.DTOs.EstatisticaDTO;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequiredArgsConstructor
public class EstatisticaController {
    @Resource
    private EstatisticaService service;

    @GetMapping("/distancia") 
    @CrossOrigin(origins = "*") 
    public ResponseEntity<EstatisticaDTO> estatisticas(@RequestParam final int distancia){
        return new ResponseEntity<>(service.findById((long) distancia), OK);
    }
}
