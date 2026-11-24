package br.com.fiap.main;

import br.com.fiap.entities.Colaborador;

public class TesteColaborador {

    public static void main(String[] args) {

        //instanciar o obj
        Colaborador objColaborador = new Colaborador();

        //entradas
        objColaborador.setNumeroRegistro(555);
        objColaborador.setNome("Carlo");
        objColaborador.setCargo("T.I");
        objColaborador.setSalario(15545.45);

        //saidas
        System.out.println(objColaborador.getNumeroRegistro());
        System.out.println(objColaborador.getNome());
        System.out.println(objColaborador.getCargo());
        System.out.println(objColaborador.getSalario());



    }
}
