package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = new String();
        String senha = new String();
        
        System.out.println("Infome o nome de usuario: ");
        nome = sc.nextLine();
        
        System.out.println("Infome a senha: ");
        senha = sc.nextLine();
        
        while (senha.equals(nome)){
            System.out.println("Nome de usuario nao pode ser igual nome de usuario!!");
            
            System.out.println("Infome o nome de usuario: ");
            nome = sc.nextLine();
        
            System.out.println("Infome a senha: ");
            senha = sc.nextLine();
        }
    }
}