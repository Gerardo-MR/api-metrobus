package com.example.apimetrobus.services;

import com.example.apimetrobus.repositories.AlcaldiaRepository;
import com.example.apimetrobus.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.querydsl.binding.OptionalValueBinding;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AlcaldiaService {
    @Autowired
    AlcaldiaRepository alcaldiaRepository;


    public ArrayList<AlcaldiasModel> obtenerAlcaldiaNombre(String nombre){
        return alcaldiaRepository.findByNombre(nombre);
    }

    public ArrayList<AlcaldiasModel> obtenerAlcaldias(){
        return (ArrayList<AlcaldiasModel>) alcaldiaRepository.findAll();
    }

    public AlcaldiasModel guardarAlcaldia(AlcaldiasModel alcaldia){
        return alcaldiaRepository.save(alcaldia);
    }

  
}
