package br.com.estudo.GestaoEstacionamento.Service;

import br.com.estudo.GestaoEstacionamento.Entity.VagaModel;
import br.com.estudo.GestaoEstacionamento.Repository.VagaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VagaService {

    private final VagaRepository vagaRepository;
    public VagaService(VagaRepository vagaRepository){
        this.vagaRepository = vagaRepository;
    }

    public VagaModel adicionarVaga(VagaModel vaga){
        return vagaRepository.save(vaga);
    }

    public List<VagaModel> buscarVagas(){
        return vagaRepository.findAll();
    }

    public Optional<VagaModel> buscarVagaPorId(Long id){
        return vagaRepository.findById(id);
    }

    public VagaModel atualizarVaga(Long id, VagaModel vagaAtualizada){
        VagaModel vaga = vagaRepository.findById(id).orElseThrow(() -> new RuntimeException("Vaga de ID: " + id + ", não encontrada!"));
        vaga.setCodigo(vagaAtualizada.getCodigo());
        vaga.setOcupada(vagaAtualizada.getOcupada());
        vaga.setTipoVeiculo(vagaAtualizada.getTipoVeiculo());
        return vagaRepository.save(vaga);
    }

    public void deletarVaga(Long id){
        vagaRepository.deleteById(id);
    }
}
