package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=0;
        double num[] = new double[5];
        
        for (int i=0; i<5; i++){
            System.out.println("Informe um valor: ");
            num[i] = sc.nextDouble();
            if (i==0){
                a = num[0];
            }
            if (num[i]>a){
                a = num[i];
            }
        }
        
        System.out.println("O maior valor informado foi: " + a);
    }
}