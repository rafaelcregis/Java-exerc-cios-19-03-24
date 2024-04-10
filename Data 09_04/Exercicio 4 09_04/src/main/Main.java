
package main;

import javax.swing.JOptionPane;


public class Main {

   
    public static void main(String[] args) {
       String x = JOptionPane.showInputDialog(null,"Digite um valor");
       int valor1 = Integer.parseInt(x);
       
        x = JOptionPane.showInputDialog(null,"Digite outro valor");
       int valor2 = Integer.parseInt(x);
               
       JOptionPane.showMessageDialog(null,"A soma dos valores é " + (valor1 + valor2));
        
    }
    
}

