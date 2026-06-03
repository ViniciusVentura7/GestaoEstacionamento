package br.com.estudo.GestaoEstacionamento.Service;

import br.com.estudo.GestaoEstacionamento.Entity.VeiculoModel;
import br.com.estudo.GestaoEstacionamento.Repository.VeiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {

    private final VeiculoRepository veiculoRepository;
    public VeiculoService (VeiculoRepository veiculoRepository){
        this.veiculoRepository = veiculoRepository;
    }

    public VeiculoModel adicionarVeiculo(VeiculoModel veiculo){
        return veiculoRepository.save(veiculo);
    }

    public List<VeiculoModel> buscarVeiculos(){
        return veiculoRepository.findAll();
    }

    public Optional<VeiculoModel> buscarVeiculoPorId(Long id){
        return veiculoRepository.findById(id);
    }

    public VeiculoModel atualizarVeiculo(Long id, VeiculoModel veiculoAtualizado){
        VeiculoModel veiculo = veiculoRepository.findById(id).orElseThrow(() -> new RuntimeException("Veículo de ID: " + id + ", não encontrado!"));
        veiculo.setTipoVeiculo(veiculoAtualizado.getTipoVeiculo());
        veiculo.setAno(veiculoAtualizado.getAno());
        veiculo.setPlaca(veiculoAtualizado.getPlaca());
        veiculo.setCor(veiculoAtualizado.getCor());
        veiculo.setModelo(veiculoAtualizado.getModelo());
        veiculo.setVaga(veiculoAtualizado.getVaga());
        veiculo.setUsuario(veiculoAtualizado.getUsuario());
        return veiculoRepository.save(veiculo);
    }

    public void deletarVeiculo(Long id){
        veiculoRepository.deleteById(id);
    }
}
