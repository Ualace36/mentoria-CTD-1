package com.mentoria.ctd.apibancaria.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class TitularNotFoundException extends RuntimeException{
    public TitularNotFoundException(Long id) {
        super("Não encontramos registros no nosso DATABASE com esse id: " + id);
    }
}
