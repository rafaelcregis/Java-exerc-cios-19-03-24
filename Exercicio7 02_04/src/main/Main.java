package main;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
    Scanner grava = new Scanner(System.in);
    int soma = 0, quant=0;
    double media=0;
    
        for(int idade=1; quant<10; quant++){
            System.out.println("Digite a idade");  
            idade = grava.nextInt();
            soma=soma+idade;
           
            }
            
            media = soma / quant;
            System.out.println("A média é  "+ media);

         } 
    
    
}