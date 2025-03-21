package fr.eni.ludotheque.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "JEU")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Jeu {

    @Id
    @Column(name = "no_jeu")
    private Long noJeu;

    @Column(name = "titre", nullable = false)
    private String titre;

    @Column(name = "reference", nullable = false)
    private String reference;

    @Column(name = "age_min")
    private Integer ageMin;

    @Column(name = "description")
    private String description;

    @Column(name = "duree")
    private Integer duree;

    @Column(name = "tarif_jour", nullable = false)
    private BigDecimal tarifJour;
}
