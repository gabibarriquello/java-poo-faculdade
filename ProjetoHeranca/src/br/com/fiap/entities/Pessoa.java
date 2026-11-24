package br.com.fiap.entities;

public abstract class Pessoa {

    protected String nome;
    protected String email;
    protected String fone;
    protected double renda;

    //construtor vazio

    public Pessoa() {
    }

    //construtor cheio: Guarda os 4 atributos comuns

    public Pessoa(String nome, String email, String fone, double renda) {
        this.nome = nome;
        this.email = email;
        this.fone = fone;
        this.renda = renda;
    }

    //getters e setter: metodos para ler (get) e mudar (set) cada atributo

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    //toString diz como o objeto aparece quando é escrito

    @Override
    public String toString() {
        return "Pessoa" +
                "\nnome= " + nome + '\'' +
                "\nemail= " + email + '\'' +
                "\nfone= " + fone + '\'' +
                "\nrenda= " + renda;
    }
}
