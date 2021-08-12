package com.example.apimetrobus.repositories;

import com.example.apimetrobus.models.AlcaldiasModel;

import org.springframework.data.repository.CrudRepository;
import java.util.ArrayList;


public interface AlcaldiaRepository extends CrudRepository<AlcaldiasModel,Long> {
    public abstract ArrayList<AlcaldiasModel>  findByNombre(String nombre);
   

}
