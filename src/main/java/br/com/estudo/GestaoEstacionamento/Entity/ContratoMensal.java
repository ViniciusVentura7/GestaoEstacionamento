package br.com.estudo.GestaoEstacionamento.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "tb_contrato_mensalista")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContratoMensal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "vencimento")
    private LocalDate vencimento;

    @Column(name = "valor_mensalidade")
    private BigDecimal valorMensalidade;

    @Enumerated(EnumType.STRING)
    private StatusContrato statusContrato;

    @OneToOne
    UsuarioModel usuario;

}
