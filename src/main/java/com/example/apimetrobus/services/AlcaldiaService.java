package com.example.apimetrobus.services;

import com.example.apimetrobus.repositories.AlcaldiaRepository;
import com.example.apimetrobus.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AlcaldiaService {
    @Autowired
    AlcaldiaRepository alcaldiaRepository;


    public ArrayList<AlcaldiasModel> obtenerAlcaldiaNombre(String alcaldia){
        return alcaldiaRepository.findByNombre(alcaldia);
    }

    public Optional<AlcaldiasModel> obtenerPorId(Long id){
        return alcaldiaRepository.findById(id);
    }

    public ArrayList<AlcaldiasModel> obtenerAlcaldias(){
        return (ArrayList<AlcaldiasModel>) alcaldiaRepository.findAll();
    }

    public AlcaldiasModel guardarAlcaldia(AlcaldiasModel alcaldia){
        return alcaldiaRepository.save(alcaldia);
    }

  
}
