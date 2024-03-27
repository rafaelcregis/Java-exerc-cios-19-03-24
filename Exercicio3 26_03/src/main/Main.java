package main;
 
 
import java.util.*;
 
public class Main {
 
    
    public static void main(String[] args) {
      Scanner grava = new Scanner(System.in);
     
      int a=0, b=0, c=0, t=0, cont=0;
      
      System.out.println("Digite o primeiro valor");
      a = grava.nextInt();
      
      System.out.println("Digite o segundo valor");
      b = grava.nextInt();
      
      System.out.println("Digite o terceiro valor");
      c = grava.nextInt();
      
      while (cont < 5) {
          if(a > b) {
          t = a;
          a = b;
          b = t;
          
          }else if(b > c) {
          t = b;
          b = c;
          c = t;
          }
      cont++;
      }

      System.out.println( a + "  " + b + " "+ c);
    }
}