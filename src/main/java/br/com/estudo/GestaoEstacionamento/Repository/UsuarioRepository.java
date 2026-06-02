package br.com.estudo.GestaoEstacionamento.Repository;

import br.com.estudo.GestaoEstacionamento.Entity.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
}
