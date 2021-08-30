package com.pas.ControleCorredor.Controllers;

import com.pas.ControleCorredor.Services.EventoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import com.pas.ControleCorredor.DTOs.EventoDTO;
import com.pas.ControleCorredor.DTOs.EstatisticaDTO;
import lombok.RequiredArgsConstructor;

import javax.annotation.Resource;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequiredArgsConstructor
@RequestMapping("/estatisticas")
public class EstatisticaController {
    @GetMapping() 
    @CrossOrigin(origins = "*") 
    public EstatisticaDTO estatisticas(@RequestParam final int distancia){
        
    }
}
