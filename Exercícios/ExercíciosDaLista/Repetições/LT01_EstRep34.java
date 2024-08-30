/**
 * Gustavo Jorge Geres
 * LT01_EstCond34
 * 22/08/2024
 * 
 * Receba um número. Calcule e mostre os resultados da tabuada desse número.    
 * 
 */
import javax.swing.JOptionPane;
public class LT01_EstRep34 {
    public static void main(String[] args) {
        int x, y, T;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        T = 1;
        while (T <= 10) {
            y = (x * T);
            JOptionPane.showMessageDialog(null,x+" x "+T+" = "+y);
            T++;
        }
    }
}
