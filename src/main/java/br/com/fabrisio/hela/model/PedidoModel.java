package br.com.fabrisio.hela.model;

import java.time.LocalDateTime;

/**
 * PedidoModel
 */
public class PedidoModel {

    private Long id;
    private EnumPedidoStatus status;
    private LocalDateTime dataPedido;
    private LocalDateTime dataPagamento;
    private List<ItemPedidoModel> itens;
    private Integer countPedidoAberto;
    private StatsModel stats;
    private static Long count = 0;
    private static Long count2 = 0;

    public  PedidoModel(){
        this.id = ++count;
        this.status = EnumPedidoStatusModel.ABERTO;
        this.dataPedido = LocalDateTime.now();
        this.itens = new ArrayList<ItemPedidoModel>();
        this.countPedidoAberto = ++count2;
        this.stats = new StatsModel();   
    }

    public void cancelar(){
        countPedidoAberto = 0;
        stats.cancelamentos();
    }

    public void addProduto(ProdutoModel produto, Integer qtd){
        if(status.equals(EnumPedidoStatusModel.ABERTO)){
            this.itens.add(new ItemPedidoModel(produto , qtd));
        }else if(status.equals(EnumPedidoStatusModel.CANCELADO)){
            throw new RuntimeException("Seu pedido foi Cancelado, abra um novo pedido");
        }else{
            throw new RuntimeException("Seu pedido está pago, abra um novo pedido");
        }
    }

    public void removeItem(ItemPedidoModel item){
        itens.remove(item);
    }

    public void pagar(){
        if(status.equals(EnumPedidoStatusModel.ABERTO)){
            status = EnumPedidoStatusModel.PAGO;
            dataPagamento = LocalDateTime.now();
            countPedidoAberto = 0;
            LocalDateTime media = dataPagamento.minus(dataPagamento);
            stats.medioTempo(media);
            stats.pagar();
        }else if(status.equals(EnumPedidoStatusModel.CANCELADO)){
            throw new RuntimeException("Seu pedido foi Cancelado, abra um novo pedido");
        }else{
            throw new RuntimeException("Seu pedido está pago, abra um novo pedido");
        }
    }

    public static Long getCount() {
        return count;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public Long getId() {
        return id;
    }
    
    public List<ItemPedidoModel> getItens() {
        return itens;
    }

    public EnumPedidoStatus getStatus() {
        return status;
    }

    public Integer getCountPedidoAberto() {
        return countPedidoAberto;
    }
}