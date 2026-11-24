package br.com.fiap.main;

import br.com.fiap.entities.Colaborador;

import javax.swing.*;

public class TesteSistema {

    //String
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }
    //int
    static int inteiro(String j){
        return Integer.parseInt((JOptionPane.showInputDialog(j)));
    }
    //double
    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        //Instanciar objetos e entradas
        //int numeroRegistro, String nome, String cargo, double quantidadeHoras, double valorHora
        Colaborador objColaborador = new Colaborador(
                inteiro("INFORMAÇÕES DO COLABORADOR\nNúmero de registro"),
                texto("Nome "),
                texto("Cargo"),
                real("Quantidade de Horas"),
                real("Valor da Hora Trabalhada")
        );

        //Saídas
        System.out.println(
                objColaborador
        );

    }
}
