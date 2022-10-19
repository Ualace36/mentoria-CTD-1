package com.mentoria.ctd.apibancaria.service;

import com.mentoria.ctd.apibancaria.exception.TitularNotFoundException;
import com.mentoria.ctd.apibancaria.model.TitularEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface IService <T>{




    TitularEntity getById(Long id) ;


    Iterable <TitularEntity> getAll();

    void delete(Long id);

    void create(TitularEntity titularEntity);
}
