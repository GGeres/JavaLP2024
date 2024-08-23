/**
 * Gustavo Jorge Geres
 * LT01_EstCond35
 * 22/08/2024
 * 
 * Receba 2 números inteiros, verifique qual o maior entre eles. 
 * Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.         
 * 
 */
import javax.swing.JOptionPane;
public class LT01_EstRep35 {
    public static void main(String[] args) {
        int x, y, B, L, i, d, imp;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        if (x > y) {
            B = x;
            L = y;
        } else{
            B = y;
            L = x;
        }
        imp = 0;
        i = L;
        while (i < B) {
            d = (i % 2);
            if (d != 0) {
                imp = imp + i;
            }
            i++;
        }
        JOptionPane.showMessageDialog(null,"O resultado da somatória dos números ímpares entre "+x+" e "+y+" é: "+imp);
    }
}
