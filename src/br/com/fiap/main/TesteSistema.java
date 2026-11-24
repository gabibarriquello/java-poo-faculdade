package br.com.fiap.main;

import br.com.fiap.entities.Cliente;
import br.com.fiap.entities.Colaborador;

import java.util.Arrays;

public class TesteSistema {

    public static void main(String[] args) {

        //instanciar os obj
        Cliente objCliente = new Cliente();
        Colaborador objColaborador = new Colaborador();

        //entradas dos Clientesss -> objNomedaClasse.SET para entrada
        objCliente.setNome("Gabi");
        objCliente.setCpf("555.555.555/55");
        objCliente.setIdade(20);
        objCliente.setAltura(1.63);

        //entradas dos Colaboradoresss ->objNomedaClasse.set
        objColaborador.setNumeroRegistro(123);
        objColaborador.setNome("Carlos");
        objColaborador.setCargo("T.I");
        objColaborador.setSalario(15554.50);

        System.out.println("Dados Clientes: s");
        //saidas do Clientes -> objNomedaClasse.GET para saidas
        System.out.println(objCliente.getNome());
        System.out.println(objCliente.getCpf());
        System.out.println(objCliente.getIdade());
        System.out.println(objCliente.getAltura());

        System.out.println("Dados Colaborador: ");
        //saidas do Colaborador
        System.out.println(objColaborador.getNumeroRegistro());
        System.out.println(objColaborador.getNome());
        System.out.println(objColaborador.getCargo());
        System.out.println(objColaborador.getSalario());

    }
}
