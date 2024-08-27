package com.loja.brinquedos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Brinquedo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "brinquedo_seq")
    @SequenceGenerator(name = "brinquedo_seq", sequenceName = "brinquedo_seq", allocationSize = 1)
    private Long id;
    private String nome;
    private String descricao;
    private String tipo;
    private String classificacao;
    private Double tamanho;
    private Double preco;
}
