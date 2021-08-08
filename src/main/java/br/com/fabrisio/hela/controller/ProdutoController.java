package br.com.fabrisio.hela.controller;

import java.math.BigDecimal;

import br.com.fabrisio.hela.armazenamento.SalvaDados;
import br.com.fabrisio.hela.model.EnumTipoProdutoModel;
import br.com.fabrisio.hela.model.PessoaModel;
import br.com.fabrisio.hela.model.ProdutoModel;

/**
 * ProdutoController
 */
@RestController
@RequestMapping("/produto")
public class ProdutoController {
    
    @GetMapping("/cadastrar")
    public cadastrar(
        @RequestParam String nome,
        @RequestParam BigDecimal valor,
        @RequestParam EnumTipoProdutoModel tipo
    ){
        PessoaModel logado = SalvaDados.Login;
        if(logado.getAcesso() < 0){
            ProdutoModel produto = new ProdutoModel(nome, valor, tipo);
            SalvaDados.produtos.add(produto);
        }else{
            throw new RuntimeException ("Você não tem acesso a está função");
        }
    }

    @GetMapping("/listar")
    public listar(){
        return SalvaDados.produtos;
    }

    @GetMapping("/excluir")
    public excluir(
        @RequestParam Long id
    ){
        if(logado.getAcesso() < 0){
            for (ProdutoModel produto : SalvaDados.produtos) {
                if(id.equals(produto.getId())){
                    SalvaDados.produtos.remove();
                }
            }
        }else{
            throw new RuntimeException ("Você não tem acesso a está função");
        }
    }

    @GetMapping("/alterar")
    public cadastrarcliente(
        @RequestParam Long id,
        @RequestParam String nome,
        @RequestParam BigDecimal valor,
        @RequestParam EnumTipoProdutoModel tipo
    ){
        if(logado.getAcesso() < 0){
            for (ProdutoModel produto : SalvaDados.produtos) {
                if(id.equals(produto.getId())){
                    produto.alterar(nome, valor, tipo);
                }
            }
        }else{
            throw new RuntimeException ("Você não tem acesso a está função");
        }
    }
}