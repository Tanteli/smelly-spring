package fr.formation.smellyspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.smellyspring.entities.SmellyUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SmellyUserRepository extends JpaRepository<SmellyUser, Long> {
    // Empty
}
