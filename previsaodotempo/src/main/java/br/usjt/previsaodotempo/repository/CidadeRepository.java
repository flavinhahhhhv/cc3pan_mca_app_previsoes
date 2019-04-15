package br.usjt.previsaodotempo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.previsaodotempo.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
