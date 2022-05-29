package revisao.desafiotecnico.gft.funcionarios;

/*
Considerando o diagrama abaixo, feito para uma empresa de vendas.
Nesse contexto, utilize o conceito de Herança para remodelá-lo e implemente um programa que explore
o domínio em questão:
Regras:
a) Crie uma classe mãe chamada Funcionario com os atributos nome, cpf (passados pelo construtor),
uma constante para armazenar o valor do salário mínimo e um método abstrato “calcularSalario”;
b) Vendedores ganham 1 salário mínimo, mais uma comissão por vendas;
c) Consultores ganham somente pelas horas que trabalharam.
 */

public abstract class Funcionarios {
    //1ª criar classe mãe, chamada Funcionários.
    //2º adicionar abstract na classe, já que ela será a classe mãe de Vendedor e Consultor
    //3º Criar atributos:
    public String nome;
    public long cpf;
    public final Double SALARIO_MINIMO = 1000.0; //< 6º passo: criar constante

    //4º criar construtor: alt + insert > construtor > seleciona tudo

    public Funcionarios(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //5º criar método abstrato calculaSalario
    public abstract double calculaSalario();

    //6º criar constante, conforme solicitado, nos atributos, acima;

    //7º criar classes vendedor e consultor
}
