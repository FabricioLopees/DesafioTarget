package me.fabricio.challenge1;

import java.util.*;

public class App {
    public static void main(String[] args){

        // Obtém número do usuário
        int userNumber = getUserNumber();

        // Faz verificação do número
        boolean isFibonacciNumber = fibonacci(userNumber);

        // Exibe na tela o resultado
        printMessage(isFibonacciNumber, userNumber);
    }

    private static boolean fibonacci(int userNumber){

        int previousNumber = 0;
        int currentNumber = 1;
        boolean isFibonacciNumber = false;

        // Confere se o número fornecido pelo usuário é igual a 0, se sim:
        // então ele é um número fibonacci
        if(userNumber == 0){
            isFibonacciNumber = true;
        }


        // Verifica se o número fornecido pelo usuário faz parte da sequência fibonacci
        while(currentNumber <= userNumber){
            if(currentNumber == userNumber){
                isFibonacciNumber = true;
            }

            int nextNumber = currentNumber + previousNumber;

            previousNumber = currentNumber;
            currentNumber = nextNumber;
        }

        return isFibonacciNumber;
    }


    // Utiliza um scanner para obter a entrada do usuário e retorna o número obtido
    private static int getUserNumber(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int userNumber = scanner.nextInt();

        scanner.close();

        return userNumber;
    }
    
    private static void printMessage(boolean isFibonacciNumber, int userNumber){
        if(isFibonacciNumber == true){
            System.out.println("O número "+userNumber+" faz parte da sequência de fibonacci.");
        }else{
            System.out.println("O número "+userNumber+" não faz parte da sequência de fibonacci.");
        }
    }
}