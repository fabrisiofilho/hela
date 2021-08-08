package br.com.fabrisio.hela.controller;

import br.com.fabrisio.hela.armazenamento.SalvaDados;
import br.com.fabrisio.hela.model.EnumPedidoStatusModel;
import br.com.fabrisio.hela.model.ItemPedidoModel;
import br.com.fabrisio.hela.model.PedidoModel;
import br.com.fabrisio.hela.model.ProdutoModel;

/**
 * PedidoController
 */
@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @GetMapping("/cadastrar")
    public cadastrar(){
        PedidoModel pedido = new PedidoModel();
        if(pedido.getCountPedidoAberto() == 0){
            SalvaDados.pedidos.add(pedido);
        }else{
            throw new RuntimeException ("Há um pedido aberto");
        }
    }

    @GetMapping("/adicionar")
    public adicionar(
        @RequestParam Long idpedido,
        @RequestParam Long id,
        @RequestParam Integer qtd){
        for (PedidoModel pedido : SalvaDados.pedidos) {
             if(idpedido.equals(pedido.getId())){
                for (ProdutoModel produto : SalvaDados.produtos) {
                    if(id.equals(produto.getId())){
                        pedido.addProduto(produto, qtd);
                    }
                }
             }
        }   
    }

    @GetMapping("/retirar")
    public retirar(
        @RequestParam Long idItem){
        for (PedidoModel pedido : SalvaDados.pedidos) {
            for (ItemPedidoModel item : pedido.getItens()) {
                if(idItem.equals(item.getId())){
                    pedido.removeItem(item);
                }
            }
        }   
    }

    @GetMapping("/listar")
    public listar(){
        return SalvaDados.pedidos; 
    }

    @GetMapping("/pagar")
    public pagar(
        @RequestParam Long idpedido){
        for (PedidoModel pedido : SalvaDados.pedidos) {
             if(idpedido.equals(pedido.getId())){
                pedido.pagar();
             }
        }   
    }

    @GetMapping("/excluir")
    public excluir(
        @RequestParam Long idpedido){
        for (PedidoModel pedido : SalvaDados.pedidos) {
             if(idpedido.equals(pedido.getId())){
                if(pedido.getStatus().equals(EnumPedidoStatusModel.ABERTO) || pedido.getStatus().equals(EnumPedidoStatusModel.CANCELADO)) {
                    SalvaDados.pedidos.remove(pedido);
                    pedido.cancelar();
                }else if(pedido.getStatus().equals(EnumPedidoStatusModel.PAGO)){
                    throw new RuntimeException ("Pedido já foi pago");
                }
             }
        }   
    }
}