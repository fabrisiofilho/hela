package br.com.fabrisio.hela.controller;

import br.com.fabrisio.hela.armazenamento.SalvaDados;
import br.com.fabrisio.hela.model.PessoaModel;

/**
 * LoginController
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/login")
    public void login(
        @RequestParam String email,
        @RequestParam String senha){
        
        email.toLowerCase();
        senha.toLowerCase();
        
        for (PessoaModel pessoa : SalvaDados.pessoas) {
            if(email.equals(pessoa.getEmail()) && senha.equals(pessoa.getSenha())){
                SalvaDados.Login = pessoa;
            }
        }
    }
}