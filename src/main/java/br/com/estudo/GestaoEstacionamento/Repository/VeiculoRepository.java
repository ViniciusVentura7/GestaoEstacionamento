package br.com.estudo.GestaoEstacionamento.Repository;

import br.com.estudo.GestaoEstacionamento.Entity.VeiculoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<VeiculoModel, Long> {
}
