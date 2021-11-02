package intro;

import java.util.Scanner;

public class Medidas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("O P Ç Õ E S");
        System.out.println("c - calcular area o modo curto");
        System.out.println("e - Calcular area o modo extenso ");
        System.out.println("i - If Simples ");
        System.out.println("d - Contar ate dez ");
        System.out.println("r - Contagem regrassiva de 10 ate 0 ");
        System.out.println("Qual opção desejada : ");
        String opcao = scanner.next();


        switch (opcao) {
            case "i":
            case "I":
                System.out.println("Você escolher executar o metodo ifSimpes ");
                ifSimples();
                break;
            case "r":
            case "R":
                System.out.println("Você escolher executar o metodo contagemRegressiva ");
                contagemRegressiva();
                break;
            case "d":
            case "D":
                System.out.println("Você escolher executar o metodo contarAteDez");
                contarAteDez();
                break;
            case "c":
            case "C":
                System.out.println("Você escolher executar o metodo calcularAreaModoCurto ");
                calcularAreaModoCurto();
                break;
            case "e":
            case "E":
                System.out.println("Você escolher executar o metodo calcularAreaModoextenso ");
                calcularAreaModoExtenso();
                break;
            default:
                System.out.println("Você escolher outro valor que não tem uma ação associada ");
                break;
        }
    }

    public static void ifSimples() {

        String modo = "curto";

        if (modo == "curto") {
            calcularAreaModoCurto();
        } else {
            calcularAreaModoExtenso();
        }

    }

    public static void calcularAreaModoCurto() {
        System.out.println("Calculo de area modo curto");

        int largura = 4;
        int comprimento = 3;

        System.out.println("A largura de " + largura + "m e o comprimento de "
                + comprimento + "m a area e de " + largura * comprimento + " m");
    }

    public static void calcularAreaModoExtenso() {

        System.out.println("Calculo de area modo extenso");
        int largura;
        int comprimento;
        int resultado;

        largura = 5;
        comprimento = 6;

        resultado = largura * comprimento;
        System.out.println("A largura de " + largura + "m e o comprimento de "
                + comprimento + "m a area e de " + resultado + " m");

    }

    public static void contarAteDez() {
        System.out.println("Contagem crescente ");
        for (int numero = 1; numero <= 10000; numero++) {
            System.out.println(numero);
        }
    }

    public static void contagemRegressiva() {
        System.out.println("Contagem regressiva ");
        for (int numero = 10; numero > -1; numero--) {
            System.out.println(numero);
        }

    }
}


