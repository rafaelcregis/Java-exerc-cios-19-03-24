package main;

import javax.swing.JOptionPane;


public class Main {

   
    public static void main(String[] args) {
       String x = JOptionPane.showInputDialog(null,"Digite nota 1º Bimestre");
       int valor1 = Integer.parseInt(x);
       
       x = JOptionPane.showInputDialog(null,"Digite nota 2º Bimestre");
       int valor2 = Integer.parseInt(x);
        
       x = JOptionPane.showInputDialog(null,"Digite nota 3º Bimestre");
       int valor3 = Integer.parseInt(x);
       
       JOptionPane.showMessageDialog(null,"O aluno Rafael teve como média a nota " + (valor1 + valor2 + valor3)/3, "TESTE 1", -1);
        
    }
    
}
