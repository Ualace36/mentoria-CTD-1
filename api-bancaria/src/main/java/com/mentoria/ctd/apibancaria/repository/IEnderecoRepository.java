package com.mentoria.ctd.apibancaria.repository;

import com.mentoria.ctd.apibancaria.model.EnderecoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEnderecoRepository extends JpaRepository<EnderecoEntity, String> {
}
