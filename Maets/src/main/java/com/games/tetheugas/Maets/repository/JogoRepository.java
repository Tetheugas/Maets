package com.games.tetheugas.Maets.repository;

import com.games.tetheugas.Maets.model.Jogo;
import org.hibernate.query.NativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JogoRepository extends JpaRepository<Jogo, String> {
    Jogo findById(long id);

}
