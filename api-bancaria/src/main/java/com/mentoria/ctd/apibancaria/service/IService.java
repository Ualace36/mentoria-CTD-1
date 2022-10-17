package com.mentoria.ctd.apibancaria.service;

import com.mentoria.ctd.apibancaria.exception.ResourceNotFoundException;

import java.util.List;

public interface IService <T>{

    T getById(Long id) throws ResourceNotFoundException;

    List<T> getByAll() throws ResourceNotFoundException;

    String delete (Long id) throws ResourceNotFoundException;

}
