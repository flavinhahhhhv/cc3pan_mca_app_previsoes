package br.usjt.previsaodotempo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.usjt.previsaodotempo.model.DiaSemana;
@Service
public interface DiaSemanaRepository extends JpaRepository<DiaSemana, Long>{

}
