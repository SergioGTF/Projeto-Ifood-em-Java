package com.mycompany.telacliente;

import com.mycompany.telausuario.Usuario;

public class UsuarioCliente extends Usuario {

    private String nome;
    private String cpf;
    private String telefone;
    private String celular;
    private String dataNascimento;
    private String sexo;

    public UsuarioCliente(String nome, String cpf, String email, String senha,
            String telefone, String celular, String dataNascimento, String sexo) {
        super(email, senha);
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.celular = celular;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public void exibirdetalhesUsuario() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Email: " + getEmail());
        System.out.println("Senha: " + getSenha());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Celular: " + getCelular());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Sexo: " + getSexo());
    }
}
