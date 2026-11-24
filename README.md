# ☕ Java POO - Faculdade

Projetos e exercícios de **Programação Orientada a Objetos (POO) em Java** feitos durante a faculdade (FIAP).

Cada pasta é um projeto independente que pratica um conceito novo de POO, do mais básico (classes e encapsulamento) até herança e classes abstratas.

## 📂 Projetos

| # | Projeto | Conceito principal |
|---|---------|--------------------|
| 1 | [ProjetoClienteColaborador](./ProjetoClienteColaborador) | Classes, objetos e encapsulamento (getters e setters) |
| 2 | [Atributo-de-referencia](./Atributo-de-referencia) | Atributo de referência (associação entre classes) |
| 3 | [ProjetoMaisMetodos](./ProjetoMaisMetodos) | Construtores, métodos de cálculo e `toString()` |
| 4 | [ProjetoHeranca](./ProjetoHeranca) | Herança, classe abstrata e `super` |

Todos seguem a mesma organização em pacotes:

```
src/br/com/fiap/
├── entities/   # classes de modelo (atributos + métodos)
└── main/       # classes com o método main, para testar
```

---

### 1. ProjetoClienteColaborador

Primeiro contato com POO: criar classes, instanciar objetos com `new` e usar **encapsulamento** (atributos `private` + getters e setters).

- **`Cliente`**: nome, cpf, idade, altura
- **`Colaborador`**: numeroRegistro, nome, cargo, salario
- **Classes de teste:** `TesteCliente`, `TesteColaborador` e `TesteSistema`, que testa as duas juntas

```java
Cliente objCliente = new Cliente();
objCliente.setNome("Gabi");             // entrada (set)
System.out.println(objCliente.getNome()); // saída (get)
```

---

### 2. Atributo-de-referencia

Mostra que uma classe pode ter como atributo **um objeto de outra classe**.

- **`Colaborador`**: numeroRegistro, nome, cpf, rg, setor, salario e **`endereco` (do tipo `Endereco`)**
- **`Endereco`**: logradouro, numero, complemento, cep, bairro, cidade, estado
- **`Produto`**: codigo, tipo, marca, preco

```java
objColaborador.setEndereco(objEndereco);              // associa o endereço ao colaborador
objColaborador.getEndereco().getCidade();             // acesso encadeado
```

---

### 3. ProjetoMaisMetodos

Classe `Colaborador` com **construtores** (vazio e cheio), **métodos com regra de negócio** e `toString()` sobrescrito. Os dados são digitados pelo usuário em janelas do `JOptionPane`.

| Método | O que faz |
|--------|-----------|
| `calcularSalario()` | `valorHora * quantidadeHoras` |
| `calcularIr()` | Calcula o imposto de renda pela faixa do salário |
| `infoStatus()` | Informa se o colaborador é isento ou contribuinte de IR |
| `salarioLiquido()` | Salário bruto menos o IR |

Faixas de IR usadas no exercício:

| Salário bruto | Alíquota |
|---------------|----------|
| Abaixo de R$ 5.000,00 | Isento |
| De R$ 5.000,00 até R$ 7.350,00 | 7,5% |
| Acima de R$ 7.350,00 | 27,5% |

---

### 4. ProjetoHeranca

Introduz **herança** com uma classe pai **abstrata**.

```
           Pessoa (abstract)
     nome, email, fone, renda
          /              \
   PessoaFisica      PessoaJuridica
    cpf, rg        segmento, cnpj, razaoSocial, nomeFantasia
```

- `Pessoa` é `abstract`, então não pode ser instanciada direto (`new Pessoa()` dá erro).
- Os atributos da classe pai são `protected`, para as filhas acessarem.
- As filhas usam `extends Pessoa` e chamam `super(...)` no construtor para o pai guardar os dados comuns.
- Cada classe sobrescreve o `toString()` com `@Override`.
- A entrada dos dados também é feita com `JOptionPane`.

---

## 📚 Conceitos praticados

- Classes, objetos e instanciação (`new`)
- Encapsulamento (`private`, getters e setters)
- Pacotes (`entities` e `main`)
- Atributo de referência (associação)
- Construtores vazio e cheio
- Métodos com regra de negócio (`if / else if / else`)
- Sobrescrita de `toString()` com `@Override`
- Herança (`extends`, `super`, `protected`)
- Classe abstrata (`abstract`)
- Entrada de dados com `JOptionPane` e conversão com `Integer.parseInt` / `Double.parseDouble`

## ▶️ Como executar

Os projetos foram feitos no **IntelliJ IDEA**. Para rodar:

1. Abra a pasta do projeto desejado na IDE.
2. Marque a pasta `src` como *Sources Root*, se ela ainda não estiver marcada.
3. Execute a classe de teste em `br/com/fiap/main`, por exemplo `TesteSistema`.

Pelo terminal (dentro da pasta de um projeto):

```bash
javac -d out src/br/com/fiap/entities/*.java src/br/com/fiap/main/*.java
java -cp out br.com.fiap.main.TesteSistema
```

## 🛠️ Tecnologias

- Java (JDK 8 ou superior)
- IntelliJ IDEA
- Swing (`JOptionPane`) para entrada de dados

## 👩‍💻 Autora

**Gabriella Barriquello** · [@gabibarriquello](https://github.com/gabibarriquello)
