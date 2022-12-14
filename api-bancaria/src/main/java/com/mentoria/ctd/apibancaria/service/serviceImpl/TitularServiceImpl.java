package com.mentoria.ctd.apibancaria.service.serviceImpl;

import com.mentoria.ctd.apibancaria.exception.TitularNotFoundException;
import com.mentoria.ctd.apibancaria.model.EnderecoEntity;
import com.mentoria.ctd.apibancaria.model.TitularEntity;
import com.mentoria.ctd.apibancaria.repository.IEnderecoRepository;
import com.mentoria.ctd.apibancaria.repository.ITitularRepository;
import com.mentoria.ctd.apibancaria.service.IService;
import com.mentoria.ctd.apibancaria.service.IViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

@Service
public class TitularServiceImpl implements IService {

    @Autowired
    private IViaCepService viaCepService;
    @Autowired
    private IEnderecoRepository enderecoRepository;
    @Autowired
    private ITitularRepository titularRepository;


//    public List<TitularEntity> getAll(){
//        return titularMap.values().stream().collect(Collectors.toList());
//    }

//    public TitularEntity create(TitularEntity titularCreate){
//        String uuid = getUUID();
//        titularCreate.setId(uuid);
//        titularCreate.setEndereco(new EnderecoEntity());
//        titularMap.put(uuid, titularCreate);
//        return titularCreate;
//    }

//    public TitularEntity getById(String id) throws TitularNotFoundException {
//        TitularEntity titular = titularMap.get(id);
//        if (titular == null) {
//            throw new TitularNotFoundException(id);
//        }
//        return titular;
//    }


    @Override
    public TitularEntity getById(@PathVariable Long id) throws TitularNotFoundException {
        Optional<TitularEntity> titularEntity = titularRepository.findById(id);
        if (titularEntity.isEmpty()) {
            throw new TitularNotFoundException(id);
        }
        return titularEntity.get();
    }

    @Override
    public Iterable<TitularEntity> getAll() {
        return titularRepository.findAll();

    }

    @Override
    public void delete(@PathVariable Long id) throws TitularNotFoundException {
        titularRepository.deleteById(id);
        if (titularRepository.existsById(id)) {
            throw new TitularNotFoundException(id);
        }

    }

    @Override
    public TitularEntity create(TitularEntity titularEntity) {
        String cep = titularEntity.getEndereco().getCep();
        EnderecoEntity enderecoEntity = enderecoRepository.findById(cep).orElseGet(() -> {
            EnderecoEntity novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        titularEntity.setEndereco(enderecoEntity);
        titularRepository.save(titularEntity);
        return titularEntity;
    }

    @Override
    public TitularEntity atualizar(Long id, TitularEntity titularEntity) {
        Optional<TitularEntity> titulardb = titularRepository.findById(id);
        if (titulardb.isPresent()) {
            String cep = titularEntity.getEndereco().getCep();
            EnderecoEntity enderecoEntity = enderecoRepository.findById(cep).orElseGet(() -> {
                EnderecoEntity novoEndereco = viaCepService.consultarCep(cep);
                enderecoRepository.save(novoEndereco);
                return novoEndereco;
            });
            titularEntity.setEndereco(enderecoEntity);
            titularRepository.save(titularEntity);
        }
        return titularEntity;
    }

}




