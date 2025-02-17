package org.example.msscolarite.repository;

import org.example.msscolarite.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EtudiantRep extends JpaRepository<Etudiant, Long> {
}
