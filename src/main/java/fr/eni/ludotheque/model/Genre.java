package fr.eni.ludotheque.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "GENRE")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Genre {

    @Id
    @Column(name = "no_genre")
    private Long noGenre;

    @Column(name = "label", nullable = false)
    private String label;
}


