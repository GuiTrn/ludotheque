package fr.eni.ludotheque.repository;

import fr.eni.ludotheque.model.Jeu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JeuRepository extends JpaRepository<Jeu, Long> {
}
