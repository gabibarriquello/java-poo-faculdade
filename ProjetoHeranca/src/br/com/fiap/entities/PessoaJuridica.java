package br.com.fiap.entities;

public class PessoaJuridica extends Pessoa{

    private String segmento;
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;

    //metodo construtor vazio


    public PessoaJuridica() {
    }

    //metodo construtor cheio e guardando os atributos comuns com o pai

    public PessoaJuridica(String nome, String email, String fone, double renda, String segmento, String cnpj, String razaoSocial, String nomeFantasia) {
        super(nome, email, fone, renda); //mesma ideia: pai guarda pra mim
        this.segmento = segmento;   //guarda os dela
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
    }

    //getters e setters

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    //toString

    @Override
    public String toString() {
        return "\n\nPessoaJuridica" +
                "\nsegmento='" + segmento + '\'' +
                "\ncnpj='" + cnpj + '\'' +
                "\nrazaoSocial='" + razaoSocial + '\'' +
                "\nnomeFantasia='" + nomeFantasia + '\'' +
                "\nnome='" + nome + '\'' +
                "\nemail='" + email + '\'' +
                "\nfone='" + fone + '\'' +
                "\nrenda=" + renda;
    }
}
