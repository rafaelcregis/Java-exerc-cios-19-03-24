package main;

import java.util.Scanner;

public class Main {

  

    public static void main(String[] args) {
    Scanner grava = new Scanner(System.in);
    int soma = 0, numero=0 ;
        for(int quant=0, par=0;  quant<4; quant++){
                if(par%2==0){
                    System.out.println("Digite um número");  
                    numero = grava.nextInt();
                     
            }
            soma=soma+par;
        }   
            System.out.println("A soma dos números pares é  "+ soma);

      
    
    }
}
