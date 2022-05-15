package com.playasmex.hackOcean.services;

import com.playasmex.hackOcean.models.PlayaModel;
import com.playasmex.hackOcean.repositories.PlayaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PlayaService {
    @Autowired
    PlayaRepository playaRepository;

    public ArrayList<PlayaModel> getPlayas(){
        return (ArrayList<PlayaModel>) playaRepository.findAll();
    }
}
