package br.com.fabrisio.hela.controller;

import br.com.fabrisio.hela.armazenamento.SalvaDados;
import br.com.fabrisio.hela.model.AdminModel;
import br.com.fabrisio.hela.model.ClientModel;
import br.com.fabrisio.hela.model.FuncionarioModel;
import br.com.fabrisio.hela.model.PessoaModel;

/**
 * PessoaController
 */
@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @GetMapping("/cadastrar-cliente")
    public cadastrarcliente(
        @RequestParam String nome,
        @RequestParam String email,
        @RequestParam String senha,
        @RequestParam String documento,
        @RequestParam String telefone
    ){
        ClientModel cliente = new ClientModel(nome.toLowerCase(), email.toLowerCase(), senha.toLowerCase(), documento.toLowerCase(), telefone.toLowerCase() , 0);
        SalvaDados.pessoas.add(cliente);
    }

    @GetMapping("/cadastrar-funcionario")
    public cadastrarfuncionario(
        @RequestParam String nome,
        @RequestParam String email,
        @RequestParam String senha,
        @RequestParam String documento,
        @RequestParam String telefone
    ){
        FuncionarioModel funcionario = new FuncionarioModel(nome.toLowerCase(), email.toLowerCase(), senha.toLowerCase(), documento.toLowerCase(), telefone.toLowerCase(), 1);
        SalvaDados.pessoas.add(funcionario);
    }

    @GetMapping("/cadastrar-admin")
    public cadastraradmin(
        @RequestParam String nome,
        @RequestParam String email,
        @RequestParam String senha,
        @RequestParam String documento,
        @RequestParam String telefone
    ){
        AdminModel admin = new AdminModel(nome.toLowerCase(), email.toLowerCase(), senha.toLowerCase(), documento.toLowerCase(), telefone.toLowerCase(), 2);
        SalvaDados.pessoas.add(admin);
    }

    @GetMapping("/listar")
    public List<PessoaModel> listar(){
        return SalvaDados.pessoas;
    }

    @GetMapping("/excluir")
    public excluir(
        @RequestParam String nome,
        @RequestParam String email,
        @RequestParam String senha,
        @RequestParam String documento,
        @RequestParam String telefone
    ){
        
        nome.toLowerCase();
        email.toLowerCase();
        senha.toLowerCase();
        documento.toLowerCase();
        telefone.toLowerCase();

        for (PessoaModel p : SalvaDados.pessoas) {
            if(nome.equals(p.getNome()) && email.equals(p.getEmail()) && senha.equals(p.getSenha()) && documento.equals(p.getDocumento()) && telefone.equals(p.getTelefone())){
                SalvaDados.pessoas.remove(p);
                return p;
            }
        }
    }

    @GetMapping("/alterar-nome")
    public alterarNome(
        @RequestParam String nome,
        @RequestParam String email,
        @RequestParam String senha,
        @RequestParam String documento,
        @RequestParam String telefone,
        @RequestParam String alterar
    ){
        nome.toLowerCase();
        email.toLowerCase();
        senha.toLowerCase();
        documento.toLowerCase();
        telefone.toLowerCase();
        alterar.toLowerCase();
        
        for (PessoaModel p : SalvaDados.pessoas) {
            if(nome.equals(p.getNome()) && email.equals(p.getEmail()) && senha.equals(p.getSenha()) && documento.equals(p.getDocumento()) && telefone.equals(p.getTelefone())){
                p.alterarNome(alterar);
                return p;
            }
        }
    }

    @GetMapping("/alterar-senha")
    public alterarSenha(
        @RequestParam String nome,
        @RequestParam String email,
        @RequestParam String senha,
        @RequestParam String documento,
        @RequestParam String telefone,
        @RequestParam String alterar
    ){
        nome.toLowerCase();
        email.toLowerCase();
        senha.toLowerCase();
        documento.toLowerCase();
        telefone.toLowerCase();
        alterar.toLowerCase();
        
        for (PessoaModel p : SalvaDados.pessoas) {
            if(nome.equals(p.getNome()) && email.equals(p.getEmail()) && senha.equals(p.getSenha()) && documento.equals(p.getDocumento()) && telefone.equals(p.getTelefone())){
                p.alterarSenha(alterar);
                return p;
            }
        }
    }

    @GetMapping("/alterar-email")
    public alterarEmail(
        @RequestParam String nome,
        @RequestParam String email,
        @RequestParam String senha,
        @RequestParam String documento,
        @RequestParam String telefone,
        @RequestParam String alterar
    ){
        nome.toLowerCase();
        email.toLowerCase();
        senha.toLowerCase();
        documento.toLowerCase();
        telefone.toLowerCase();
        alterar.toLowerCase();
        
        for (PessoaModel p : SalvaDados.pessoas) {
            if(nome.equals(p.getNome()) && email.equals(p.getEmail()) && senha.equals(p.getSenha()) && documento.equals(p.getDocumento()) && telefone.equals(p.getTelefone())){
                p.alterarEmail(alterar);
                return p;
            }
        }
    }

    @GetMapping("/alterar-telefone")
    public alterarTelefone(
        @RequestParam String nome,
        @RequestParam String email,
        @RequestParam String senha,
        @RequestParam String documento,
        @RequestParam String telefone,
        @RequestParam String alterar
    ){
        nome.toLowerCase();
        email.toLowerCase();
        senha.toLowerCase();
        documento.toLowerCase();
        telefone.toLowerCase();
        alterar.toLowerCase();
        
        for (PessoaModel p : SalvaDados.pessoas) {
            if(nome.equals(p.getNome()) && email.equals(p.getEmail()) && senha.equals(p.getSenha()) && documento.equals(p.getDocumento()) && telefone.equals(p.getTelefone())){
                p.alterarTelefone(alterar);
                return p;
            }
        }
    }

    @GetMapping("/alterar-documento")
    public alterarDocumento(
        @RequestParam String nome,
        @RequestParam String email,
        @RequestParam String senha,
        @RequestParam String documento,
        @RequestParam String telefone,
        @RequestParam String alterar
    ){
        nome.toLowerCase();
        email.toLowerCase();
        senha.toLowerCase();
        documento.toLowerCase();
        telefone.toLowerCase();
        alterar.toLowerCase();
        
        for (PessoaModel p : SalvaDados.pessoas) {
            if(nome.equals(p.getNome()) && email.equals(p.getEmail()) && senha.equals(p.getSenha()) && documento.equals(p.getDocumento()) && telefone.equals(p.getTelefone())){
                p.alterarDocumento(alterar);
                return p;
            }
        }
    }


    
}