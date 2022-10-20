package com.mentoria.ctd.apibancaria.controller;


import com.mentoria.ctd.apibancaria.model.TitularEntity;
import com.mentoria.ctd.apibancaria.service.serviceImpl.TitularServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/titular")
public class TitularController {
    @Autowired
    private final TitularServiceImpl titularService;


    public TitularController(TitularServiceImpl titularService) {
        this.titularService = titularService;
    }
//    @GetMapping
//    public ResponseEntity<List<TitularDTO>> getAll(){
//        List<TitularEntity> titularList = titularService.getAll();
//        List<TitularDTO> result = titularMapper.toTitularDTOList(titularList);
//        return ResponseEntity.ok(result);
//    }

    @GetMapping
    public ResponseEntity<Iterable<TitularEntity>> getAll() {
        return ResponseEntity.ok(titularService.getAll());
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<TitularDTO> getById(@PathVariable String id) throws TitularNotFoundException {
//        TitularEntity titular = (TitularEntity) titularService.getById(id);
//        TitularDTO titularDTO = titularMapper.toTitularDTO(titular);
//        return ResponseEntity.ok((titularDTO));
//    }

    @GetMapping("/{id}")
    public ResponseEntity<TitularEntity> getById(@PathVariable Long id){
        return ResponseEntity.ok(titularService.getById(id));
    }

//    @PostMapping
//    public ResponseEntity<TitularDTO> create(@RequestBody CriarTItularDTO dto){
//         var titualarCreate = titularMapper.toTitularCreate(dto);
//         var titular = titularService.create(titualarCreate, new EnderecoEntity());
//         var result = titularMapper.toTitularDTO(titular);
//         return ResponseEntity.status(HttpStatus.CREATED).body(result);
//    }

    @PostMapping
    public ResponseEntity<TitularEntity> inserir(@RequestBody TitularEntity titularEntity ){
        titularService.create(titularEntity);
        return ResponseEntity.ok(titularEntity);
    }
     @DeleteMapping("/{id}")
    public ResponseEntity deletar(@PathVariable Long id ){
        titularService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<TitularEntity> atualizar(@PathVariable Long id, @RequestBody TitularEntity titularEntity){
        titularService.atualizar(id, titularEntity);
        return ResponseEntity.ok(titularEntity);
    }
}


