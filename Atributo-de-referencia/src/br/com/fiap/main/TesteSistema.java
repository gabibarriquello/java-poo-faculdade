package br.com.fiap.main;

import br.com.fiap.entities.Colaborador;
import br.com.fiap.entities.Endereco;
import br.com.fiap.entities.Produto;

public class TesteSistema {

    public static void main(String[] args) {

        //instanciar objetos
        Colaborador objColaborador = new Colaborador();
        Endereco objEndereco = new Endereco();
        Produto objProduto = new Produto();

        //entradas do colaborador
        objColaborador.setNumeroRegistro(123);
        objColaborador.setNome("Braufagelio");
        objColaborador.setCpf("222.222.222/22");
        objColaborador.setRg("11.111.111-1");
        objColaborador.setSetor("T.I");
        objColaborador.setSalario(5555.45);

        //entradas do endereco
        objEndereco.setLogradouro("Rua apito do vapor");
        objEndereco.setNumero(555);
        objEndereco.setComplemento("casa");
        objEndereco.setCep("00-485-698");
        objEndereco.setBairro("Cidade Tiradentes");
        objEndereco.setCidade("São Paulo");
        objEndereco.setEstado("SP");

        objColaborador.setEndereco(objEndereco);

        //Entradas do produto
        objProduto.setCodigo(123);
        objProduto.setTipo("Mouse");
        objProduto.setMarca("Mac");
        objProduto.setPreco(45.50);

        //saidas
        System.out.println("N de Registro do Colaborador : " + objColaborador.getNumeroRegistro() +
        "\nNome do Colaborador : " + objColaborador.getNome() +
        "\nCPF: " + objColaborador.getCpf() +
        "\nRG: " + objColaborador.getRg() +
        "\nSetor: " + objColaborador.getSetor() +
        "\nSalário: " + objColaborador.getSalario() +

         "\n" + "\nENDEREÇO DO COLABORADOR" +
        "\nLogradouro:  " + objColaborador.getEndereco().getLogradouro() +
        "\nNumero: " + objColaborador.getEndereco().getNumero() +
        "\nComplemento: " + objColaborador.getEndereco().getComplemento() +
        "\nCEP: " + objColaborador.getEndereco().getCep() +
        "\nBairro: " + objColaborador.getEndereco().getBairro() +
        "\nCidade: " + objColaborador.getEndereco().getCidade() +
        "\nEstado: " + objColaborador.getEndereco().getEstado()
        );

        //saidas produtos
        System.out.println(
         "\nINFORMAÇÕES DO PRODUTO" +
         "\nCódigo: " + objProduto.getCodigo() +
         "\nTipo:  " + objProduto.getTipo() +
         "\nMarca: " + objProduto.getMarca() +
         "\nPreço: " + objProduto.getPreco()
        );
    }
}
