package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        double A=80000, B=200000;
        
        System.out.println("Populacao A = 80000 habitantes; taxa de crescimento = 3.0");
        System.out.println("Populacao B = 200000 habitantes; taxa de crescimento = 1.5");
        
        while (A <= B){
            A = A * 1.03;
            B = B * 1.015;
            i++;
        }
        
        System.out.println("A populacao do pais A igualaria ou ultrapassaria a populacao do pais B em " + i + " anos.");
    }
}