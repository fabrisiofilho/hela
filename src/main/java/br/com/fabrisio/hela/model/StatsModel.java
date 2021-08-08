package br.com.fabrisio.hela.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jdk.dynalink.BiClassValue;

/**
 * StatsModel
 */
public class StatsModel {

    private BigDecimal pedidosAberto;
    private BigDecimal pedidosPago;
    private BigDecimal pedidosCancelados;
    private BigDecimal pedidos;
    private LocalDateTime tempoMedio;
    private BigDecimal mediaPago;
    private BigDecimal mediaCancelamento;
    private List<ProdutoModel> produtosMaisFechados;
    private List<ProdutoModel> produtosMaisCancelados;
    private List<ProdutoModel> produtosMaisInteracao;

    public StatsModel(){
        this.pedidos = pedidos.add(BigDecimal.ONE);
        this.pedidosAberto = pedidosAberto.add(BigDecimal.ONE);
    }

    public void cancelamentos(){
        this.pedidosCancelados = pedidosCancelados.add(BigDecimal.ONE);
        this.pedidosAberto = pedidosAberto.subtract(BigDecimal.ONE);
    }

    public void medioTempo(LocalDateTime media){
        this.tempoMedio = tempoMedio.plus(media);
        tempoMedia = tempoMedio.getMinute();
    }

    public void pagos(){
        this.pedidosPago = pedidosPago.add(BigDecimal.ONE);
        this.pedidosAberto = pedidosAberto.subtract(BigDecimal.ONE);        
    }

    public BigDecimal getMediaCancelamento() {
        this.mediaCancelamento = pedidos.multiply(BigDecimal.valueOf(100)).divide(pedidosCancelados);
        return mediaCancelamento;
    }

    public BigDecimal getMediaPago() {
        this.mediaPago = pedidos.multiply(BigDecimal.valueOf(100)).divide(pedidosPago);
        return mediaPago;
    }

    public BigDecimal getPedidos() {
        return pedidos;
    }

    public LocalDateTime getTempoMedio() {
        return tempoMedio;
    }

    public BigDecimal getPedidosAberto() {
        return pedidosAberto;
    }

    public BigDecimal getPedidosCancelados() {
        return pedidosCancelados;
    }

    public BigDecimal getPedidosPago() {
        return pedidosPago;
    }

    public List<ProdutoModel> getProdutosMaisCancelados() {
        return produtosMaisCancelados;
    }

    public List<ProdutoModel> getProdutosMaisFechados() {
        return produtosMaisFechados;
    }

    public List<ProdutoModel> getProdutosMaisInteracao() {
        return produtosMaisInteracao;
    }


}