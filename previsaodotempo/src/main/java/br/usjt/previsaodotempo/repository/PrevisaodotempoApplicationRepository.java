package br.usjt.previsaodotempo.repository;

import br.usjt.previsaodotempo.model.Previsao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrevisaodotempoApplicationRepository extends JpaRepository<Previsao, Long>{

}
