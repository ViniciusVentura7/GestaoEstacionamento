package br.com.estudo.GestaoEstacionamento.Service;

import br.com.estudo.GestaoEstacionamento.Entity.ContratoMensal;
import br.com.estudo.GestaoEstacionamento.Repository.ContratoMensalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContratoMensalService {

    private final ContratoMensalRepository contratoMensalRepository;
    public ContratoMensalService(ContratoMensalRepository contratoMensalRepository){
        this.contratoMensalRepository = contratoMensalRepository;
    }

    public ContratoMensal adicionarContratoMensal(ContratoMensal novoContrato){
        return contratoMensalRepository.save(novoContrato);
    }

    public List<ContratoMensal> buscarContrato(){
        return contratoMensalRepository.findAll();
    }

    public Optional<ContratoMensal> buscarContratoPorId(Long id){
        return contratoMensalRepository.findById(id);
    }

    public ContratoMensal atualizarContrato(Long id, ContratoMensal contratoAtualizado){
        ContratoMensal contrato = contratoMensalRepository.findById(id).orElseThrow(() -> new RuntimeException("Contrato mensalista de ID: " + id + ", não encontrado!"));
        contrato.setUsuario(contratoAtualizado.getUsuario());
        contrato.setVencimento(contratoAtualizado.getVencimento());
        contrato.setStatusContrato(contratoAtualizado.getStatusContrato());
        contrato.setValorMensalidade(contratoAtualizado.getValorMensalidade());
        return contratoMensalRepository.save(contrato);
    }

    public void deletarContrato(Long id){
        contratoMensalRepository.deleteById(id);
    }
}
