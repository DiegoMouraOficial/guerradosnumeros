package io.diegomoura;

public class GuerraDosNumeros {
    public static int guerraDosNumeros(int[] numeros) {
        int somaPares = 0;
        int somaImpares = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {     // Verifica se o numero é par
                somaPares += numero;   // Adiciona o numero à soma dos números pares
            } else {
                somaImpares += numero; // Adiciona o numero à soma dos números ímpares
            }
        }
        return Math.abs(somaImpares - somaPares) ; // Retorna a diferença absoluta (Math.abs) entre as somas dos números pares e ímpares.
    }

    public static void main(String[] args) {
        int[] numeros1 = {2,8,7,5};
        int[] numeros2 = {12,90,75};
        int[] numeros3 = {5,9,45,6,2,7,34,8,6,90,5,243};

        System.out.println("Resultado 1: " + guerraDosNumeros(numeros1)); // 2
        System.out.println("Resultado 2: " + guerraDosNumeros(numeros2)); // 27
        System.out.println("Resultado 3: " + guerraDosNumeros(numeros3)); // 168
    }
}