package com.mentoria.ctd.apibancaria.repository;

import com.mentoria.ctd.apibancaria.model.TitularEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static org.hibernate.hql.internal.antlr.SqlTokenTypes.FROM;
import static org.hibernate.hql.internal.antlr.SqlTokenTypes.LIKE;
import static org.hibernate.sql.ast.Clause.SELECT;

@Repository
public interface ITitularRepository extends JpaRepository<TitularEntity, Long> {
    @Query(value = "SELECT * FROM Titutalar WHERE nome LIKE ?1 AND sobrenome LIKE ?2", nativeQuery=true)
    Optional<List<TitularEntity>> findNameFull(String nome, String sobrenome);
}
