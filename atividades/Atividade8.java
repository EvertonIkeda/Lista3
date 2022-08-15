package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=0;
        double num[] = new double[5];
        
        for (int i=0; i<5; i++){
            System.out.println("Informe um valor: ");
            num[i] = sc.nextDouble();
            a = a + num[i];
        }
        
        System.out.println("A soma dos valores informados é: " + a);
        System.out.println("A media dos valores informados é: " + (a / 5));
    }
}