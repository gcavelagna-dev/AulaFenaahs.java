package RpgAulaEAD;


import java.util.Scanner;

public class AulaEADQuiz {

    public static void analisando() {
        pausa(1000);
        System.out.println("Analisando...");
        pausa(1700);
        System.out.println("...");
        pausa(1000);
    }

    public static void proximaQuestao() {
        pausa(2000);
        System.out.println("\nPróxima questão...\n");
        pausa(3000);
    }


    public static void pausa(int tempo) {
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void linha(){

        System.out.println("=======================================");

    }


    public static void apresentacao(){

        linha();
        System.out.println("\nSeja-bem vindo ao meu quiz pelo terminal.");
        pausa(3000);
        System.out.println("Aqui aprenderemos com o seus erros, não se preocupe caso erre.");
        pausa(3000);
        System.out.println("Estamos aqui para aprender e desenvolver melhor nossas ideias...");
        pausa(3000);
        System.out.println("Bom, aproveite as 8 questões, bom jogo.");
        pausa(2000);


    }

    public static void pergunta1() {


        System.out.println("\nQuiz -1- Java e JavaScript tem diferenças?");
        linha();
        pausa(3000);

        System.out.println("1 - É praticamente igual.");
        pausa(1000);
        System.out.println("2 - Sim, há diferença.");

        linha();
        System.out.print("Digite aqui: ");

    }
   /* public static void erradaPergunta1(){
        linha();
        System.out.println("Esta afirmação está totalmente errada...");
        pausa(1000);
        System.out.println("Java é uma linguagem totalmente distinta de JavaScript");
        pausa(1000);
        System.out.println("JavaScript só recebeu este nome por uma jogada de marketing");
        pausa(2000);
        System.out.println("Onde Java estava sendo uma das linguagens mais famosas no mercado.");
        pausa(2000);
        System.out.println("Além disso, JS é para utilizações na web, enquanto Java é muito mais robusta.");
        pausa(2000);
        System.out.println("A resposta correta é a 2° Alternativa.");
        linha();
    }

    public static void certaPergunta1 (){
        linha();
        System.out.println("Parabéns, você acertou!");
        pausa(2000);
        System.out.println("Java é uma linguagem robusta voltada mais para sistemas corporativos");
        pausa(2000);
        System.out.println("Enquanto JavaScript é voltada para aplicações em páginas web.");
        linha();

    }
    */
    public static void pergunta2(){
        linha();
        System.out.println("Quiz -2- Qual linguagem é usada para estruturar/inserir arquivos em uma página web?");
        linha();
        pausa(3000);

        System.out.println("\n1 - HTML");
        pausa(1000);
        System.out.println("2 - CSS");
        pausa(1000);
        System.out.println("3 - Java");
        pausa(1000);
        System.out.println("4 - Python\n");
        linha();
        System.out.print("Digite aqui: ");

    }

    public static void pergunta3() {
        linha();
        System.out.println("Quiz -3- Qual linguagem é usada para estilizar uma página?");
        linha();
        pausa(2000);
        System.out.println("\n1 - JavaScript");
        pausa(1000);
        System.out.println("2 - HTML");
        pausa(1000);
        System.out.println("3 - CSS");
        pausa(1000);
        System.out.println("4 - Ruby");
        linha();
        System.out.print("Digite aqui: ");
    }

    public static void pergunta4 () {
        linha();
        System.out.println("Quiz -4- Qual estrutura é usada para repetir ações?");
        linha();
        pausa(2000);
        System.out.println("\n1 - if");
        pausa(1000);
        System.out.println("2 - switch");
        pausa(1000);
        System.out.println("3 - loop");
        pausa(2000);
        System.out.println("4 - while");
        linha();
        System.out.print("Digite aqui: ");
    }

    public static void pergunta5() {

        linha();
        System.out.println("Quiz -5- O que é uma variável?");
        linha();
        pausa(2000);
        System.out.println("\n1 - Um tipo de navegador");
        pausa(1000);
        System.out.println("2 - Um local para armazenar informações");
        pausa(1000);
        System.out.println("3 - Um erro do programa");
        pausa(1000);
        System.out.println("4 - Um comando de repetição");
        linha();
        System.out.print("Digite aqui: ");

    }

    public static void pergunta6() {

        linha();
        System.out.println("Quiz -6- Qual extensão pertence a um arquivo JavaScript?");
        linha();
        pausa(1000);
        System.out.println("\n1 - .java");
        pausa(1000);
        System.out.println("2 - .jvm");
        pausa(1000);
        System.out.println("3 - .js");
        pausa(1000);
        System.out.println("4 - .script");
        linha();
        System.out.print("Digite aqui: ");

    }

    public static void pergunta7() {

        linha();
        System.out.println("Quiz -7- Como se chama os sinais <> </> em HTML?");
        linha();
        pausa(1000);
        System.out.println("\n1 - Tags");
        pausa(1000);
        System.out.println("2 - Valor/Valores");
        pausa(1000);
        System.out.println("3 - Maior e Menor");
        pausa(1000);
        System.out.println("4 - Fechaduras");
        linha();
        System.out.print("Digite aqui: ");


    }

    public  static void pergunta8 () {

        linha();
        System.out.println("Quiz -8- Qual estrutura é usada para tomar decisões?");
        linha();
        pausa(1000);
        System.out.println("\n1 - while");
        pausa(1000);
        System.out.println("2 - if");
        pausa(1000);
        System.out.println("3 - for");
        pausa(1000);
        System.out.println("4 - import");
        linha();
        System.out.print("Digite aqui: ");

    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        apresentacao();
        pergunta1();
        int acertos = 0;

        boolean perguntaUm = true;

        while (perguntaUm) {
            int pergunta1 = entrada.nextInt();
            switch (pergunta1) {
                case 1:
                    analisando();
                    System.out.println("Esta afirmação está totalmente errada...");
                    pausa(2000);
                    System.out.println("Java é uma linguagem totalmente distinta de JavaScript");
                    pausa(3000);
                    System.out.println("JavaScript só recebeu este nome por uma jogada de marketing");
                    pausa(3000);
                    System.out.println("Onde Java estava sendo uma das linguagens mais famosas no mercado.");
                    pausa(4000);
                    System.out.println("Além disso, JS é para utilizações na web, enquanto Java é muito mais robusta.");
                    pausa(5000);
                    System.out.println("A resposta correta é a 2° Alternativa.");
                    linha();
                    perguntaUm = false;

                    break;

                case 2:

                    acertos++;
                    analisando();
                    System.out.println("Parabéns, você acertou!");
                    pausa(2000);
                    System.out.println("Java é uma linguagem robusta voltada mais para sistemas corporativos");
                    pausa(3000);
                    System.out.println("Enquanto JavaScript é voltada para aplicações em páginas web.");
                    pausa(4000);
                    linha();

                    System.out.println("A quantidade de acertos é de: " + acertos);

                    perguntaUm = false;
                    break;

                default:
                    analisando();
                    System.out.println("Não existe esta opção, tente novamente.");
                break;
            }

        }

        proximaQuestao();
        pergunta2();

        boolean perguntaDois = true;

        while (perguntaDois) {
            int pergunta2 = entrada.nextInt();
            switch (pergunta2) {
                case 1:

                    acertos++;
                    analisando();
                    pausa(1000);
                    System.out.println("Correto! O HTML é responsável pela estrutura e organização dos elementos de uma página.");
                    pausa(3000);
                    System.out.println("A quantidade de acertos é de: " + acertos);
                    perguntaDois = false;
                    break;

                case 2:

                    analisando();
                    pausa(1000);
                    System.out.println("Esta afirmação está incorreta, a correta era primeira");
                    linha();
                    perguntaDois = false;
                    break;

                case 3:
                    analisando();
                    pausa(1000);
                    System.out.println("Esta afirmação está incorreta, a correta era primeira");
                    linha();
                    perguntaDois = false;
                    break;
                case 4:
                    analisando();
                    pausa(1000);
                    System.out.println("Esta afirmação está incorreta, a correta era primeira");
                    linha();
                    perguntaDois = false;
                    break;
                default:
                    System.out.println("Escolha entre essas opções, tente novamente.");
                break;
            }
        }
        //certa é a 3° CSS

        proximaQuestao();
        pergunta3();

        boolean perguntaTres = true;

        while (perguntaTres) {
            int pergunta3 = entrada.nextInt();
            switch (pergunta3) {
                case 1:

                    analisando();
                    pausa(1000);
                    System.out.println("Esta afirmação está incorreta, a correta era a terceira");
                    linha();
                    perguntaTres = false;
                    break;

                case 2:

                    analisando();
                    pausa(1000);
                    System.out.println("Esta afirmação está incorreta, a correta era a terceira");
                    linha();
                    perguntaTres = false;
                    break;

                case 3:

                    acertos++;
                    analisando();
                    pausa(1000);
                    System.out.println("Correto! O CSS define cores, tamanhos, posições e o visual dos elementos.");
                    pausa(3000);
                    System.out.println("A quantidade de acertos é de: " + acertos);
                    perguntaTres = false;
                    break;

                case 4:
                    analisando();
                    pausa(1000);
                    System.out.println("Esta afirmação está incorreta, a correta era a terceira");
                    linha();
                    perguntaTres = false;
                    break;
                default:
                    System.out.println("Não existe esta opção, tente novamente.");
                break;
            }
        }

        //a resposta correta é a 4° while

        pausa(2000);
        proximaQuestao();
        pergunta4();

        boolean perguntaQuatro = true;

        while (perguntaQuatro) {
            int pergunta4 = entrada.nextInt();
            switch (pergunta4) {
                case 1:

                    analisando();
                    System.out.println("Esta afirmação está incorreta, a correta era a Quarta.");
                    linha();
                    perguntaQuatro = false;
                    break;

                case 2:

                    analisando();
                    System.out.println("Esta afirmação está incorreta, a correta era a Quarta.");
                    linha();
                    perguntaQuatro = false;
                    break;

                case 3:

                    analisando();
                    System.out.println("Esta afirmação está incorreta, a correta era a Quarta.");
                    linha();
                    perguntaQuatro = false;
                    break;

                case 4:

                    acertos++;
                    analisando();
                    System.out.println("Correto! O while repete um bloco de código enquanto uma condição for verdadeira.");
                    System.out.println("A quantidade de acertos é de: " + acertos);
                    linha();
                    perguntaQuatro = false;
                    break;

                default:
                    System.out.println("Escolha uma das opções acima, tente novamente.");
                break;

            }
        }

        //a resposta é a 2°

        proximaQuestao();
        pergunta5();

        boolean perguntaCinco = true;

        while (perguntaCinco) {
            int pergunta5 = entrada.nextInt();

            switch (pergunta5) {

                case 1:

                    analisando();
                    System.out.println("Esta afirmação está incorreta, a correta era a segunda.");
                    linha();
                    perguntaCinco = false;
                    break;

                case 2:

                    acertos++;
                    analisando();
                    System.out.println("Correto! Uma variável serve para armazenar informações que podem ser utilizadas pelo programa.");
                    pausa(3000);
                    System.out.println("A quantidade de acertos é de: " + acertos);
                    linha();
                    perguntaCinco = false;
                    break;

                case 3:

                    analisando();
                    System.out.println("Esta afirmação está incorreta, a correta era a segunda.");
                    linha();
                    perguntaCinco = false;
                    break;

                case 4:
                    analisando();
                    System.out.println("Esta afirmação está incorreta, a correta era a segunda.");
                    linha();
                    perguntaCinco = false;
                    break;

                default:
                    System.out.println("Não existe esta opção, tenet novamente.");
                break;

            }
        }

        //a 3° é a correta .js

        proximaQuestao();
        pergunta6();

        boolean perguntaSeis = true;

        while (perguntaSeis) {
            int pergunta6 = entrada.nextInt();

            switch (pergunta6) {

                case 1:

                    analisando();
                    System.out.println("Esta afirmação está incorreta, a correta era a Terceira.");
                    linha();
                    perguntaSeis = false;
                    break;

                case 2:

                    analisando();
                    System.out.println("Esta afirmação está incorreta, a correta era a Terceira.");
                    linha();
                    perguntaSeis = false;
                    break;

                case 3:

                    acertos++;
                    analisando();
                    System.out.println("Correto! Arquivos JavaScript utilizam a extensão .js, que seria o nome final do arquivo.");
                    pausa(3000);
                    System.out.println("A quantidade de acertos é de: " + acertos);
                    linha();
                    perguntaSeis = false;
                    break;

                case 4:

                    analisando();
                    System.out.println("Esta afirmação está incorreta, a correta era a Terceira.");
                    linha();
                    perguntaSeis = false;
                    break;

                default:
                    System.out.println("Não existe esta opção, tente novamente.");
                break;

            }

        }

        // a certa é o 1°

        proximaQuestao();
        pergunta7();

        boolean perguntaSete = true;
        while (perguntaSete) {
            int pergunta7 = entrada.nextInt();

            switch (pergunta7) {

                case 1:

                    acertos++;
                    analisando();
                    System.out.println("Isso mesmo!Em inglês, Tag significa etiqueta ou marcação.");
                    pausa(3000);
                    System.out.println("A quantidade de acertos é de: " + acertos);
                    linha();
                    perguntaSete = false;
                    break;

                case 2:

                    analisando();
                    System.out.println("Esta afirmação está incorreta, a correta era a Primeira.");
                    linha();
                    perguntaSete = false;
                    break;

                case 3:

                    analisando();
                    System.out.println("Esta afirmação está incorreta, a correta era a Primeira.");
                    linha();
                    perguntaSete = false;
                    break;

                case 4:

                    analisando();
                    System.out.println("Esta afirmação está incorreta, a correta era a Primeira.");
                    linha();
                    perguntaSete = false;
                    break;

                default:
                    System.out.println("Não existe esta opção, tente novamente.");
                break;

            }
        }
        //correto é a 2°

        proximaQuestao();
        pergunta8();

        boolean perguntaOito = true;

        while (perguntaOito) {
            int pergunta8 = entrada.nextInt();

            switch (pergunta8) {

                case 1:

                    analisando();
                    System.out.println("Esta afirmação está incorreta, a correta era a segunda.");
                    linha();
                    perguntaOito = false;
                    break;

                case 2:

                    acertos++;
                    analisando();
                    System.out.println("Correto! O if permite executar ações diferentes dependendo de uma condição.");
                    pausa(3000);
                    System.out.println("A quantidade de acertos é de: " + acertos);
                    linha();
                    perguntaOito = false;
                    break;

                case 3:

                    analisando();
                    System.out.println("Esta afirmação está incorreta, a correta era a segunda.");
                    linha();
                    perguntaOito = false;
                    break;

                case 4:

                    analisando();
                    System.out.println("Esta afirmação está incorreta, a correta era a segunda.");
                    linha();
                    perguntaOito = false;
                    break;

                default:
                    System.out.println("Esta opção não existe, tente novamente.");
                break;

            }
        }

        pausa(4000);
        linha();
        System.out.println("\nMeus parabéns! Você acabou de terminar este quiz.");
        pausa(3000);
        System.out.println("Agora vamos classificar sua senioridade");
        pausa(5000);
        if (acertos > 6) {
            System.out.println("Parabéns, você é um sênior!! Com total de: " + acertos + " acertos.");

        } else if (acertos >= 4){
            System.out.println("Parabéns, você é um pleno!! Com total de: " + acertos + " acertos.");

        } else
            System.out.println("Você é Junior! Com total de "+acertos+". Estude mais.");


        entrada.close();
    }

}
