package br.com.fiap.entities;

public class PessoaFisica extends Pessoa {

    private String cpf;
    private String rg;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, String email, String fone, double renda, String cpf, String rg) {
        super(nome, email, fone, renda); //entrega os dados comuns para o pai
        this.cpf = cpf;        //guarda os dela
        this.rg = rg;
    }

    //getters e setters

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    //@Override = estou escrevendo o ToString do meu jeito

    @Override
    public String toString() {
        return "PessoaFisica" +
                "\ncpf=" + cpf + '\'' +
                "\nrg='" + rg + '\'' +
                "\nnome='" + nome + '\'' +
                "\nemail='" + email + '\'' +
                "\nfone='" + fone + '\'' +
                "\nrenda=" + renda;
    }
}
