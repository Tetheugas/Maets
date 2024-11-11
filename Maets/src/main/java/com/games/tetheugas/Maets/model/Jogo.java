package com.games.tetheugas.Maets.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serial;
import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
@Table(name = "tb_games")
public class Jogo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(name = "game_name")
    @NonNull
    private String gameName;

    @Column(name = "date")
    @NonNull
    private String date;

    @Column(name = "description")
    @NonNull
    private String description;

    @Column(name = "image", length = 500)
    @NonNull
    private String image;
}
