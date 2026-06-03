package br.com.estudo.GestaoEstacionamento.Repository;

import br.com.estudo.GestaoEstacionamento.Entity.ContratoMensalModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratoMensalRepository extends JpaRepository<ContratoMensalModel, Long> {
}
