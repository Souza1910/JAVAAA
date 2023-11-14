package aula1010;

import java.util.Scanner;

public class conta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero1, numero2, resultado;
        char operacao;

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        operacao = scanner.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextDouble();

        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }

    }
}
