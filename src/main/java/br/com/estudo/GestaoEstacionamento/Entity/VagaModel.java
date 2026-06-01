package br.com.estudo.GestaoEstacionamento.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_vaga")
public class VagaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "ocupada")
    private Boolean ocupada;

    @Column(name = "tipo_veiculo")
    @Enumerated(EnumType.STRING)
    private TipoVeiculo tipoVeiculo;

}