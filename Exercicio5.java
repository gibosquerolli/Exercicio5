package com.mycompany.exercicio5;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numeroMaisAlto = 0;
            int alturaMaisAlta = 0;
            int somaAltura = 0;
            int contadorMenor178 = 0;
            
            for (int i = 1; i <= 3; i++) {
                System.out.println("Digite o número do atleta" + i + ":");
                int numero = scanner.nextInt();
                
                System.out.println("Digite a altura (em cm) do atleta " + i + ":");
                int altura = scanner.nextInt();
                
                if (altura > alturaMaisAlta) {
                    alturaMaisAlta = altura;
                    numeroMaisAlto = numero;
                }
                
                somaAltura += altura;
                
                if (altura < 178) {
                    contadorMenor178++;
                }
            }
            double media = somaAltura / 3.0;
            
            System.out.println("\n=== RESULTADOS ===");
            System.out.println("Atleta mais alto: número" + numeroMaisAlto + " com" + alturaMaisAlta + " cm");
            System.out.printf("Altura média do grupo: %.2f cm\n", media);
            System.out.println("Número de atletas com altura menor que 178 cm: " + contadorMenor178);
        }
    }
} 
