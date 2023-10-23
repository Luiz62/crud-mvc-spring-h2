package Luiz62.com.github.agendavirtualprofessorhenrique.domain.repository;

import Luiz62.com.github.agendavirtualprofessorhenrique.domain.entity.ContatoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface ContatoRepository extends JpaRepository<ContatoEntity, Long> { }
