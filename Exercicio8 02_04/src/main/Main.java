package main;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
    Scanner grava = new Scanner(System.in);
 
        int tab=0;
        
        System.out.println("Qual a tabuada você deseja?");
        tab = grava.nextInt();
        System.out.println("");
        System.out.println("TABUADA");
        
        for(int cont=0; cont<10;){
       
           cont++;
           System.out.println(tab + " X " + cont + " = "+(tab*cont));
            
       }
      
    }
    

 }
