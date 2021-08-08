package br.com.fabrisio.hela.model;

/**
 * ClientModel
 */
public class ClientModel extends PessoaModel{

    public ClientModel(String nome, String documento, String senha, String email, String telefone, Integer acesso){
        super(nome, documento, senha, email, telefone, acesso);
    }
    private List<PedidoModel> pedidos;

}