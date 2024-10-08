package com.loja.brinquedos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fornecedor_seq")
    @SequenceGenerator(name = "fornecedor_seq", sequenceName = "fornecedor_seq", allocationSize = 1)
    private Long id;
    private String nome;
    private String endereco;
    private String telefone;

    @OneToMany(mappedBy = "fornecedor", cascade = CascadeType.ALL)
    private List<Brinquedo> brinquedos;
}