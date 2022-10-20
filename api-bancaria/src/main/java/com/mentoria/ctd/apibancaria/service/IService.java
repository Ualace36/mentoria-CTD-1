package com.mentoria.ctd.apibancaria.service;

import com.mentoria.ctd.apibancaria.model.TitularEntity;

public interface IService <T>{




    TitularEntity getById(Long id) ;


    Iterable <TitularEntity> getAll();

    void delete(Long id);

    void create(TitularEntity titularEntity);

    void atualizar(Long id, TitularEntity titularEntity);
}
