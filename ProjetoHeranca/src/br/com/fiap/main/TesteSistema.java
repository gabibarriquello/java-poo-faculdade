package br.com.fiap.main;

import br.com.fiap.entities.PessoaFisica;
import br.com.fiap.entities.PessoaJuridica;

import javax.swing.*; // traz as janelinhas (JOptionaPane)

public class TesteSistema {

    //static: dá para usar direto, sem criar objeto (sem new)
    //abre uma janelinha com a pergunta e devolve o que foi digitado
     static String texto(String j){
         return JOptionPane.showInputDialog(j);
     }
     //mesma coisa mas transforma o que foi digitado em um número inteiro
    static int inteiro(String j){
         return Integer.parseInt(JOptionPane.showInputDialog(j));
    }
    //mesmissima coisa mas agr retorna um double
    static double real(String j){
         return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {
        //new Pessoa daria erro, porque pessoa é ABSTRACT,

        //criar uma insatacia para a PessoaFisica
        PessoaFisica objPessoaFisica = new PessoaFisica(
                texto("Informações da Pessoa Física\nNome"),
                texto("Email"),
                texto("Telefone"),
                real("Renda"),
                texto("CPF"),
                texto("RG")
        );


        //cria a pessoa juridica do mesmo jeito
        // String nome, String email, String fone, double renda, String segmento, String cnpj, String razaoSocial, String nomeFantasia
        PessoaJuridica objPessoaJuridica = new PessoaJuridica(
                texto("Informações sobre Pessoa Juridica\nNome"),
                texto("Email"),
                texto("Fone"),
                real("Renda"),
                texto("Segmento"),
                texto("CNPJ"),
                texto("Razão Social"),
                texto("Nome Fantasia")
        );

        //saida/ imprime as duas (usando o toString de cada uma)
        System.out.println(objPessoaFisica + "" + objPessoaJuridica);
    }


}
