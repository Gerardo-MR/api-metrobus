package com.example.apimetrobus.controller;

import com.example.apimetrobus.services.AlcaldiaService;
import com.example.apimetrobus.models.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.*;

@RestController
@RequestMapping("/alcaldias")
public class AlcaldiasController {
    @Autowired
    RestTemplate restTemplate;
    AlcaldiaService alcaldiaService;

    @GetMapping

    public ArrayList<AlcaldiasModel> obtenerAlcaldias(){
        return alcaldiaService.obtenerAlcaldias();
    }

    
    @PostMapping()
    public AlcaldiasModel guardarUsuario(@RequestBody AlcaldiasModel alcaldia){
        return this.alcaldiaService.guardarAlcaldia(alcaldia);
    }

    @GetMapping("/query")
    public ArrayList<AlcaldiasModel> obtenerUsuarioPorPrioridad(@RequestParam("nombre") String nombre) {
        return this.alcaldiaService.obtenerAlcaldiaNombre(nombre);
    }

  

    

}
