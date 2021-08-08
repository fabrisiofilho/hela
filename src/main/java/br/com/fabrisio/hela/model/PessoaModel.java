package br.com.fabrisio.hela.model;

/**
 * PessoaModel
 */
public abstract class PessoaModel {

    private Long id;
    private String nome;
    private String sobrenome;
    private String documento;
    private String senha;
    private String email;
    private String telefone;
    private static Long count = 0;
    private Integer acesso;

    public PessoaModel(String nome, String sobrenome, String documento, String senha, String email, String telefone, Integer acesso){
        this.id = ++count;
        this.nome = nome;
        this.documento = documento;
        this.senha = senha;
        this.email = email;
        this.telefone = telefone;
        this.acesso = acesso;
    }

    public static Long getCount() {
        return count;
    }
    
    public void alterarNome(String nome){
        this.nome = nome;
    }

    public void alterarSenha(String senha){
        this.senha = senha;
    }

    public void alterarEmail(String email){
        this.email = email;
    }

    public void alterarTelefone(String telefone){
        this.telefone = telefone;
    }

    public void alterarDocumento(String documento){
        this.documento = documento;
    }

    public String getDocumento() {
        return documento;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void getValidarCpf(){
        
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Integer getAcesso() {
        return acesso;
    }
}