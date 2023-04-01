package Questão03;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {

        double saldo, ajustado;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o seu saldo: ");

        saldo = leitor.nextDouble();

        System.out.println("Seu saldo com o ajuste é de: " + (saldo * 1.01));
    }
}

