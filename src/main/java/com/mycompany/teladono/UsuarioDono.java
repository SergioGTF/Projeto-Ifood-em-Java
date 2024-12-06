package com.mycompany.teladono;

import com.mycompany.telausuario.Usuario;

public class UsuarioDono extends Usuario{
    private String nome;
    private String ID;
    private String cpf;
    

    public UsuarioDono(String email, String senha, String nome, String ID, String cpf) {
        super(email, senha);
        this.nome = nome;
        this.ID = ID;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public void exibirdetalhesUsuario(){
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Senha " + getSenha());
        System.out.println("ID: " + getID());
        System.out.println("CPF : " + getCpf());
    }
}
