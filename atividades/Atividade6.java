package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[21];
        
        for (int i=1; i<21; i++){  
            System.out.println(num[i]=i);
        }
        
        for (int i=1; i<21; i++){
            System.out.print(num[i] + ", ");
        }
    }
}