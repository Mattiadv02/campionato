package it.unimol.campionato;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface SquadreRepository extends JpaRepository<Squadre, Integer> { }
