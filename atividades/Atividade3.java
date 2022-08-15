package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = new String();
        int idade;
        double salario;
        String sexo = new String();
        String estadoCivil = new String();
        
        do{
            System.out.println("Infome o nome de usuario (mais que 3 caracteres): ");
            nome = sc.nextLine();
            if (nome.length() <= 3){
                System.out.println("Nome invalido");
            }
        } while(nome.length() <= 3);
        
        do{
            System.out.println("Informe a idade (0 - 150): ");
            idade = sc.nextInt();
            if (idade < 0 || idade > 150){
                System.out.println("Idade invalido");
            }
        } while(idade < 0 || idade > 150);
        
        do{
            System.out.println("Infome o salario: ");
            salario = sc.nextDouble();
            if (salario < 0){
                System.out.println("Salario invalido");
            }
        } while(salario < 0);
        
        do{
            System.out.println("Infome o sexo ('f' ou 'm'): ");
            sexo = sc.nextLine();
            sexo = sc.nextLine();
            if (!(sexo.equals("f") || sexo.equals("m") || sexo.equals("F") || sexo.equals("M"))){
                System.out.println("Sexo invalido");
            }
        } while(!(sexo.equals("f") || sexo.equals("m") || sexo.equals("F") || sexo.equals("M")));
        
        do{
            System.out.println("Infome o estado civil ('s', 'c', 'v' ou 'd')");
            estadoCivil = sc.nextLine();
            if (!(estadoCivil.equals("s") || estadoCivil.equals("c") || estadoCivil.equals("v") || estadoCivil.equals("d") || estadoCivil.equals("S") || estadoCivil.equals("C") || estadoCivil.equals("V") || estadoCivil.equals("D"))){
                System.out.println("Sexo invalido");
            }
        } while(!(estadoCivil.equals("s") || estadoCivil.equals("c") || estadoCivil.equals("v") || estadoCivil.equals("d") || estadoCivil.equals("S") || estadoCivil.equals("C") || estadoCivil.equals("V") || estadoCivil.equals("D")));
    }
}