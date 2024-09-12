/**
 * 
 * Gustavo Jorge Geres
 * 
 * LT01_EstMod23
 * Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor
 * não necessariamente em ordem. Mostre os 4 números em ordem crescente. 
 * 12/09/2024
 * 
 **/
import javax.swing.JOptionPane;
public class LT01_EstMod23 {
    static int x, y, z, a;
    public static void main(String[] args) {
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
        z = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor"));
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto valor"));
        
    }
}
