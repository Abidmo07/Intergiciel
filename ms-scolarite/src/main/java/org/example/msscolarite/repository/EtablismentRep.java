package org.example.msscolarite.repository;

import org.example.msscolarite.entities.Etablisment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EtablismentRep extends JpaRepository<Etablisment, Long> {
}
