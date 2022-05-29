package revisao.desafiotecnico.gft;

/*
Classe Macaco:
Faça um programa e teste interativamente uma classe que modele um macaco com os atributos “nome”
e “bucho” (estômago) e os métodos “comer”, “verBucho” e “digerir”.
Regras:
a) Crie 2 macacos;
b) Considere que a quantidade máxima de alimentos é 3. Com isso,
lembre-se de verificar o conteúdo do estômago a cada refeição (método “comer”).
Por fim, o método “digerir” deve esvaziar o bucho do Macaco;
c) Alimentos “digeríveis” devem ser do tipo String, garanta isso em seu código para que não haja
nenhum Macaco canibal.
 */

import java.util.ArrayList;
import java.util.List;

public class Ex2_Macaco {

// 1º passo: criar os atributos solicitados: “nome” e “bucho” (estômago)
    private String nome;
    private List<String> bucho = new ArrayList<>(); //utilizar list para organizar os alimentos na barriga // Como o exercicio pede, só é
    //possível utilizar String no estômago do macaco.
    //assim que instanciar um objeto, ele deverá nascaer com a barriga vazio, então ArraList.

    //2º passo: criar métodos. E conforme exercicio, são solicitados os métodos "comer" e "digerir":
    public void comer(String comida) { //entre (), está String pois, conforme exercicio, o macaco come apenas
        //String.
        //e no exercicio é solicitado que ele coma apenas 3 alimentos. Então
        // 3º passo: dentro do método comer, criamos um if:
        if (bucho.size() == 3) { // < chamamos o método .size junto ao bucho para descobrir qual o tamanho. Ele retorna a
            //quantidade de alimentos dessa lista. Então, se .size for igual (==) a 3, imprimiremos uma mensagem.
            //4º passo: imprimir mensagem
            System.out.println("Bucho cheio!"); //conforme exercicio, limite de 3 alimentos.
            //4º passo: caso contrário, se não, estiver com bucho cheio, usamos o else abaixo:
        } else { //pegaremos a comida e colocaremos na barriga do macaco com o método .add, de List
            //5º passo: adicionar alimentos. O ArrayList iniciou vazio, então, é necessário inserir comida.
            bucho.add(comida);
        }
        //6º passo: no exercicio, sempre que o macaco comer, é solicitado mostrar o conteúdo da barriga do macaco.
        //podemos mostrar assim, imprimindo o bucho:
        System.out.println(bucho);
    }

    //7º antes de digerir, criamos o método para exibir:
    public void digerir() { //ele não recebe nenhum argumento
    //precisamos checar se a barriga do macaco está vazia, com if, para verificar.
        //8º criamos para verificar:
        if (bucho.isEmpty()) { // .isEmpty é metodo de list e verifica se a List está vazia. bucho é um atributo do
            //tipo list
            //9º se estiver vazio, ele quer q imprima uma mensagem:
            System.out.println("Bucho vazio!");
            //se o bucho estiver vazio, ele não quer que faça a digestão. E se não estiver vazio:
            //10º criamos uma condição else, para digerir, utilizando o método remove
        } else {
            bucho.remove(bucho.get(0)); // o bucho é um list, e list possui método remove, que remove elementos da list.
            //ele vai digerir na ordem que comer e para indicar o primeiro elemento, usamos o (bucho.get()), com
            //a posição 0 dentro, pra mostrar o primeiro.

            //11º: está na classe main
        }
        System.out.println(bucho);
    }

}
