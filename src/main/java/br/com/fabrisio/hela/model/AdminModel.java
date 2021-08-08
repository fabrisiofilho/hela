package br.com.fabrisio.hela.model;

/**
 * AdminModel
 */
public class AdminModel extends PessoaModel{

    public AdminModel(String nome, String documento, String senha, String email, String telefone, Integer acesso){
        super(nome, documento, senha, email, telefone, acesso);
    }
}