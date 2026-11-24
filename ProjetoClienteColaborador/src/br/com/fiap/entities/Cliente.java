package br.com.fiap.entities;

public class Cliente {

    //visibilidade, tipo de dado e o atributo (o nome que vc escolhe)
    private String nome;
    private String cpf;
    private int idade;
    private double altura;

    //metodos setters (entradas e metodos getters (retornar\exibir)
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}//fecha classe
