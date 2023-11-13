/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject7;

/**
 *
 * @author diogo
 */
public class Mavenproject7 {

    public static void main(String[] args) {
   
         long numDiscos =41 ; 
        long inicio = System.currentTimeMillis();
        long movimentos = torresHanoi(numDiscos, 'A', 'C', 'B');
        long fim = System.currentTimeMillis();
        long tempoGasto = fim - inicio;

        String tempoFormatado = formatarTempo(tempoGasto);

        System.out.println("\nTempo gasto: " + tempoFormatado);
        System.out.println("Quantidade de movimentos: " + movimentos);
    }

    public static long torresHanoi(long n, char origem, char destino, char auxiliar) {
        if (n == 1) {
            return 1;
        } else {
            long movimentos = 0;
            movimentos += torresHanoi(n - 1, origem, auxiliar, destino);
            movimentos += 1;
            movimentos += torresHanoi(n - 1, auxiliar, destino, origem);
            return movimentos;
        }
    }

    public static String formatarTempo(long milissegundos) {
        long segundos = milissegundos / 1000;
        long horas = segundos / 3600;
        segundos = segundos % 3600;
        long minutos = segundos / 60;
        segundos = segundos % 60;
        long milissegundosRestantes = milissegundos % 1000;

        return String.format("%02d:%02d:%02d:%03d", horas, minutos, segundos, milissegundosRestantes);
    }
}