package revisao.desafiotecnico.gft;
/*
 Número Reverso:
Faça um programa que leia um valor inteiro (este número deverá conter 4 dígitos).
A saída deverá ser o reverso de um número inteiro informado.
Exemplo: Digamos que a entrada foi 3257. A resposta será 7523.
Regras:
a) A entrada deverá estar entre 1000 e 9999;
b) Se o usuário digitar 3 dígitos ou menos, o Programa avisa que tem que conter 4 dígitos e continuar
a programação até a resposta final.
 */

import java.util.Scanner;

public class Ex1_NumeroReverso {

    //1º Necessário criar um método para utilizar a classe NumeroReverso, e realizar a verificação. O laço de
    //repetição precisa ir dentro

    public static void numeroReverso() {  //< método para utilizar a classe (1º passo)
        //2º conforme solicitado no problema, é necessário uma entreda para digitação do valor inteiro com Scanner:
        Scanner scan = new Scanner(System.in);
        //3º conforme solicitado, é necessário verificar se o número é maior ou menor 3 dígitos. Então, é necessário
        //laço de repetição:
        //obs: o laço de repetição é necessário para pegar o numero porque o usuário pode digitar o valor errado
        do {
            //** 4º passo na classe Main **
            //5º passo: imprimir mensagem conforme solicitado no exercicio
            System.out.println("Informe um valor inteiro e positivo (este número deverá conter 4 dígitos): ");
            //6º passo: necessário salvar o valor informado pelo usuário em uma variável. Cria um int (numeros):
            int numeroInformado = scan.nextInt(); //< salvar o valor digitado
            //7º o laço ficará repetindo e solicitando a digitação. É necessário criar uma condição para o laço
            //se encerrar. A condição é solicitada no exercicio, coma condicional if:
            String numeroInformadoString = String.valueOf(numeroInformado); // <<< String para transformar int
            //em String, através do método 'valueOf'. <<<
            if(numeroInformado >= 1000 && numeroInformado <= 9999) { //se o valor informado for menor (>=) que 1000
                // e (&&) numeroInformado for menor (<=) que 9999).
                //8º: conforme exercicio, necessário imprimir o número de maneira inversa. No entanto, não é possível
                //exibir o número inverso com um int. É possível com uma String. Então, é necessário transformar
                //o número em String. Então, fora do laço if, é criado uma String para numeroInformado.
                //9º após usar String para transformar int em String, é necessário inverter o número(solicitado).
                //é necessário uma classe chamada 'StringBuilder', que possuí o método 'reverse'. Esse método
                //inverterá a ordem para de trás para frente. Então, detro do if:
                StringBuilder stringBuilder = new StringBuilder(numeroInformadoString); //<< chama a classe StringBuilder >
                //nomeia a classe (stringBuilder), cria o objeto (= new StringBuilder) > informa no construtor ()
                //o nome da String (numeroInformadoString)
                // 10º é possível imprimir o número de trás para frente com o método reverse:
                System.out.println(stringBuilder.reverse()); //<< sout para imprimir > stringBuilder + método de inversão
                //reverse.
                // 11º após imprimir, o laço ficará executando e solicitando a digitação dos números. É necessário
                //interromper o laço de repeticção através do 'break':
                break; //<< interrompe laço de repetição
                // 12º conforme solicitado no exercicio, "Se o usuário digitar 3 dígitos ou menos, o Programa avisa
                // que tem que conter 4 dígitos". Então, é necessário criar uma condição 'else if' e infonformar que:
                //se o numeroInformadoString, e utiliza o método .lenght() para contar os dígitos, for < (menor) que
                //4, o programa deverá imprimir a frase:
            } else if (numeroInformadoString.length() < 4) {
                System.out.println("O numero informado deverá conter 4 dígitos!");
                //não adicionamos o break aqui, para interromper, pois queremos que o usuário volte e digite o número
                //correto! então, o laço continua a executar.
            }
        } while (true);
    }
}
