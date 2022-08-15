package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Impares de 1 a 50: ");
        
        for (int i=1; i<51; i++){
            if (i % 2 == 1){
                System.out.print(i + ", ");
            }
        }
    }
}