package br.com.fiap.entities;

public class Colaborador {

    private int numeroRegistro;
    private String  nome;
    private String cargo;
    private double quantidadeHoras;
    private double valorHora;
    private double percentual;

    // metodos construtor com parametro vazio

    public Colaborador() {
    }


    //metodo construtor com parametro cheio, sem o percentual

    public Colaborador(int numeroRegistro, String nome, String cargo, double quantidadeHoras, double valorHora) {
        this.numeroRegistro = numeroRegistro;
        this.nome = nome;
        this.cargo = cargo;
        this.quantidadeHoras = quantidadeHoras;
        this.valorHora = valorHora;

    }

    //getter e setter

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(double quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    //toString
    @Override
    public String toString() {
        return "Colaborador" +
                "\nNumero de Registro: " + numeroRegistro +
                "\nNome: '" + nome + '\'' +
                "\nCargo: '" + cargo + '\'' +
                "\nQuantidade de Horas: " + quantidadeHoras +
                "\nvalor da Hora Trabalhada: " + valorHora +
                "\n\nCalculo do Salário Bruto: " + calcularSalario() +
                "\nCalculo do Imposto de Renda: " + calcularIr() +
                "\nInformação sobre o IR: " + infoStatus() +
                "\nSalário Líquido: " + salarioLiquido();
    }

    //calcularSalario() metodo para calcular salario
    public double calcularSalario() {
        return valorHora * quantidadeHoras;
    }

    //CalcularIR() metodo para calcular um imposto de renda
    public double calcularIr() {
        double calculo = 0;
       if(calcularSalario() > 7350.00) {
           this.percentual = 27.5;
           calculo = calcularSalario() * percentual /100;
       }else if(calcularSalario() >= 5000) {
           this.percentual = 7.5;
           calculo = calcularSalario() * percentual/ 100;
       }else{
           this.percentual = 0;
           calculo = percentual;
       }
        return calculo;
    }

    //InfoStatus
    public String infoStatus() {
        String informacao = null;
        if(calcularSalario() > 7350.00){
            informacao = "Contribuinte de IR com 27.5%";
        }else if(calcularSalario() >= 5000){
            informacao = "Contribuinte de IR com 7.5%";
        }else {
            informacao = "Isento de IR";
        }
        return informacao;
    }

    //salarioLiquido()
    public double salarioLiquido() {
        return calcularSalario() - calcularIr();
    }
}
