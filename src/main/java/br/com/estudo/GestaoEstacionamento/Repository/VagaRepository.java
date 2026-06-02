package br.com.estudo.GestaoEstacionamento.Repository;

import br.com.estudo.GestaoEstacionamento.Entity.VagaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VagaRepository extends JpaRepository<VagaModel, Long> {
}
