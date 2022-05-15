package com.playasmex.hackOcean.services;

import com.playasmex.hackOcean.models.ClasificacionModel;
import com.playasmex.hackOcean.repositories.ClasificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClasificacionService {
    @Autowired
    ClasificacionRepository clasifiacionRepository;

    public ArrayList<ClasificacionModel> getClasificacion(){
        return (ArrayList<ClasificacionModel>) clasifiacionRepository.findAll();
    }

    public ClasificacionModel guardarClasificacion(ClasificacionModel clasificacion){
        return clasifiacionRepository.save(clasificacion);
    }
}
