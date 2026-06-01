package br.com.estudo.GestaoEstacionamento.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_veiculo")
public class VeiculoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "placa")
    private int placa;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "cor")
    private String cor;

    @Column(name = "ano")
    private String ano;

    @Column(name = "tipo")
    @Enumerated(EnumType.STRING)
    private TipoVeiculo tipoVeiculo;

    @OneToOne(optional = true)
    UsuarioModel usuario;

    @OneToOne
    VagaModel vaga;
}
