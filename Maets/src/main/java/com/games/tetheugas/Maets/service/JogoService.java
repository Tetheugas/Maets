package com.games.tetheugas.Maets.service;


import com.games.tetheugas.Maets.model.Jogo;
import com.games.tetheugas.Maets.repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JogoService {

    @Autowired
    private JogoRepository jr;

    public Jogo criarJogo(Jogo jogo) {
        return jr.save(jogo);
    }
}
