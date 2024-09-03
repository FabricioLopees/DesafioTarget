package me.fabricio.challenge2;

import java.util.Scanner;

public class App{
    public static void main(String[] args){

        // Obtém string do usuário
        String userString = getUserString().toLowerCase();

        // Verifica se a string contém a letra A e faz a contagem
        int countLetterA = countLetter(userString);

        // Printa na tela o resultado
        printMessage(countLetterA);

    }

    // Realiza a contagem e retorna a quantidade de vezes que a letra A aparece na string
    private static int countLetter(String userString){
        final char letterA = 'a';
        int count = 0;

        for(int i = 0; i < userString.length(); i++){
            if(userString.charAt(i) == letterA){
                count++;
            }
        }

        return count;
    }

     // Utiliza um scanner para obter a entrada do usuário e retorna a string obtida
    private static String getUserString(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string:");
        String userString = scanner.nextLine();

        scanner.close();

        return userString;
    }
    
    private static void printMessage(int count){
       if(count == 0){
            System.out.println("Não há letra \"A\" na string digitada!");
       }else{
            System.out.println("A letra \"A\" aparece "+count+" vezes na string digitada.");
       }
    }
}