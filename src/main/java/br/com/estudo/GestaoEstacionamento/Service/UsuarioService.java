package br.com.estudo.GestaoEstacionamento.Service;

import br.com.estudo.GestaoEstacionamento.Entity.UsuarioModel;
import br.com.estudo.GestaoEstacionamento.Repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public UsuarioModel adicionarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

    public List<UsuarioModel> buscarUsuarios(){
        return usuarioRepository.findAll();
    }

    public Optional<UsuarioModel> buscarUsuarioPorId(Long id){
        return usuarioRepository.findById(id);
    }

    public UsuarioModel atualizarUsuario(Long id, UsuarioModel usuarioAtualizado){
        UsuarioModel usuario = usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuário de ID: " + id + ", não encontrado!"));
        usuario.setNome(usuarioAtualizado.getNome());
        usuario.setCpf(usuarioAtualizado.getCpf());
        usuario.setTipoUsuario(usuarioAtualizado.getTipoUsuario());
        usuario.setVeiculo(usuarioAtualizado.getVeiculo());
        usuario.setTelefone(usuarioAtualizado.getTelefone());
        usuario.setEmail(usuarioAtualizado.getEmail());
        return usuarioRepository.save(usuario);
    }

    public void deletarUsuario(Long id){
        usuarioRepository.deleteById(id);
    }
}
