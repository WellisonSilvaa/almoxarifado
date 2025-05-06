package com.wellison.almoxarifado.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class MovimentacaoEstoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quantidade;

    private String tipo; // Entrada ou saída de um item;

    private LocalDateTime dataHora;

    @ManyToOne //indica que várias movimentações podem estar associadas ao mesmo item, funcionário ou carreta.
    private Item item;

    @ManyToOne
    private Funcionario funcionario;

    @ManyToOne
    private Carreta carreta;

    public MovimentacaoEstoque() {}

    public MovimentacaoEstoque(int quantidade, String tipo, LocalDateTime dataHora, Item item, Funcionario funcionario, Carreta carreta) {
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.dataHora = dataHora;
        this.item = item;
        this.funcionario = funcionario;
        this.carreta = carreta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Carreta getCarreta() {
        return carreta;
    }

    public void setCarreta(Carreta carreta) {
        this.carreta = carreta;
    }
}
