package br.com.estudo.GestaoEstacionamento.Service;

import br.com.estudo.GestaoEstacionamento.Entity.ContratoMensalModel;
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

    public ContratoMensalModel adicionarContratoMensal(ContratoMensalModel novoContrato){
        return contratoMensalRepository.save(novoContrato);
    }

    public List<ContratoMensalModel> buscarContrato(){
        return contratoMensalRepository.findAll();
    }

    public Optional<ContratoMensalModel> buscarContratoPorId(Long id){
        return contratoMensalRepository.findById(id);
    }

    public ContratoMensalModel atualizarContrato(Long id, ContratoMensalModel contratoAtualizado){
        ContratoMensalModel contrato = contratoMensalRepository.findById(id).orElseThrow(() -> new RuntimeException("Contrato mensalista de ID: " + id + ", não encontrado!"));
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
