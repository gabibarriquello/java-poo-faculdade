package br.com.fiap.main;

import br.com.fiap.entities.Cliente;

public class TesteCliente {

    //metodo de execucação -> 25 public psvma / 21 psvm
    public static void main(String[] args) {

        //instanciar objeto
        Cliente objCliente = new Cliente();

        //entradas
        objCliente.setNome("Gabi a mais mais");
        objCliente.setCpf("555.555.555./55");
        objCliente.setIdade(20);
        objCliente.setAltura(1.63);

        //saidas
        System.out.println(objCliente.getNome());
        System.out.println(objCliente.getCpf());
        System.out.println(objCliente.getIdade());
        System.out.println(objCliente.getAltura());


    }//metodo de execução

}//fecha class
