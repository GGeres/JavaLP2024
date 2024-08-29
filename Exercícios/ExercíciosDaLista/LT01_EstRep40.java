/**
 * Gustavo Jorge Geres
 * LT01_EstCond40
 * 28/08/2024
 * 
 * Receba 2 números inteiros. 
 * Verifique e mostre todos os números primos existentes entre eles.          
 * 
 */

 // A FAZER



 
import javax.swing.JOptionPane;
public class LT01_EstRep40 {
    public static void main(String[] args) {
        int x, i, y, l, b;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        if (x > y) {
            b = x;
            l = y;
        } else{
            l = x;
            b = y;
        }
        
        for(i = l; i < b; i++){
            
        }
    }
}
