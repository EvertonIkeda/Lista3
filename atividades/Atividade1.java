package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=0;
        
        System.out.println("Informe a nota (0 - 10): ");
        int nota = sc.nextInt();
        
        while (nota < 0 || nota > 10){
            System.out.println("Nota informada invalida!");
            System.out.println("Informe a nota (0 - 10): ");
            nota = sc.nextInt();
        }
    }
}