package br.com.estudo.GestaoEstacionamento.Repository;

import br.com.estudo.GestaoEstacionamento.Entity.MovimentacaoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoRepository extends JpaRepository<MovimentacaoModel, Long> {
}
