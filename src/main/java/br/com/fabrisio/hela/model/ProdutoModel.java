package br.com.fabrisio.hela.model;

import java.math.BigDecimal;

/**
 * ProdutoModel
 */
public class ProdutoModel {

    private Long id;
    private String nome;
    private EnumTipoProdutoModel tipo;
    private BigDecimal valor;
    private static Long count = 0;

    public ProdutoModel(String nome, BigDecimal valor, EnumTipoProdutoModel tipo){
        this.id = ++count;
        this.nome = nome;
        this.valor = valor;
        this.tipo = tipo;
    }

    public void alterar(String nome, BigDecimal valor, EnumTipoProdutoModel tipo){
        this.nome = nome;
        this.valor = valor;
        this.tipo = tipo;
    }

    public static Long getCount() {
        return count;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public EnumTipoProdutoModel getTipo() {
        return tipo;
    }

    public BigDecimal getValor() {
        return valor;
    }

}