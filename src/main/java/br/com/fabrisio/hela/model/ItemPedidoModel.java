package br.com.fabrisio.hela.model;

import java.math.BigDecimal;

/**
 * ItemPedidoModel
 */
public class ItemPedidoModel {

    private Long id;
    private Integer qtd;
    private ProdutoModel produto;
    private BigDecimal valorTotal;
    private static Long count = 0;

    public ItemPedidoModel(ProdutoModel produto, Integer qtd){
        this.id = ++count;
        this.qtd = qtd;
        this. produto = produto;
        this.valorTotal = produto.getValor().multiply(BigDecimal.valueOf(qtd));
    }

    public static Long getCount() {
        return count;
    }

    public Long getId() {
        return id;
    }

    public ProdutoModel getProduto() {
        return produto;
    }

    public Integer getQtd() {
        return qtd;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }



}