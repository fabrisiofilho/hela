package br.com.fabrisio.hela.model;

/**
 * FuncionarioModel
 */
public class FuncionarioModel extends PessoaModel{

    public FuncionarioModel(String nome, String documento, String senha, String email, String telefone){
        super(nome, documento, senha, email, telefone, acesso);
        this.acesso = 1;
    }


}