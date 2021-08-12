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

import javax.print.DocFlavor.STRING;

@RestController
@RequestMapping("/alcaldias")
public class AlcaldiasController {
    @Autowired
    RestTemplate restTemplate;
    AlcaldiaService alcaldiaService;

    @GetMapping("/")

    public ArrayList<AlcaldiasModel> obtenerAlcaldias(){
        return alcaldiaService.obtenerAlcaldias();
    }

    
    @PostMapping()
    public AlcaldiasModel guardarAlcaldia(@RequestBody AlcaldiasModel alcaldia){
        return this.alcaldiaService.guardarAlcaldia(alcaldia);
    }

    @GetMapping("/query")
    public ArrayList<AlcaldiasModel> obtenerAlcaldiaPorNombre(@RequestParam("nombre") String nombre) {
        return this.alcaldiaService.obtenerAlcaldiaNombre(nombre);
    }

    @GetMapping("/name/{name}")
    public String mostrarResultado(@PathVariable String nombre){
        String url ="https://datos.cdmx.gob.mx/api/3/action/datastore_search?resource_id=e4a9b05f-c480-45fb-a62c-6d4e39c5180";
        return restTemplate.getForObject(url+nombre,  String.class);
    }


  

    

}
