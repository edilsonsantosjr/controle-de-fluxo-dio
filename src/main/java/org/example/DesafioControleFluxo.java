package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class DesafioControleFluxo {
    public static void main(String[] args) throws Exception{

        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int numberOne = terminal.nextInt();
        System.out.println("Digite o segundo número");
        int numberTwo = terminal.nextInt();

        try {
            count(numberOne, numberTwo);
        } catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    static void count(int numberOne, int numberTwo) throws ParametrosInvalidosException {
        if(numberOne > numberTwo) {
            throw new ParametrosInvalidosException();
        }

        int count = numberTwo - numberOne;
        for (int i=1; i <= count; i++){
            System.out.println("Imprimindo o número: " + i);
        }
    }
}