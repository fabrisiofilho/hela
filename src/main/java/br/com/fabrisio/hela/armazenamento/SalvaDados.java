package br.com.fabrisio.hela.armazenamento;

import java.util.List;

import br.com.fabrisio.hela.model.ProdutoModel;

/**
 * SalvaDados
 */
public class SalvaDados {

    private SalvaDados(){

    }

    public static PessoaModel Login = new PessoaModel();
    public static List<PessoaModel> pessoas = new ArrayList<>();
    public static List<ProdutoModel> produtos = new ArrayList<>();
    public static List<PedidoModel> pedidos = new ArrayList<>();
}