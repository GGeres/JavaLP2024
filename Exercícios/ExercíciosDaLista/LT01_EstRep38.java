/**
 * Gustavo Jorge Geres
 * LT01_EstCond35
 * 28/08/2024
 * 
 * Receba 100 números inteiros reais. 
 * Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.          
 * 
 */
import javax.swing.JOptionPane;
public class LT01_EstRep38 {
    public static void main(String[] args) {
        int l, b, x, i;

        i = 0;
        b = 0;
        l = 1000000000;
        // O teste está sendo realizado com até 5 número ao invés de 100 
        while (i < 5) {
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            if (x > 0) {
                if (x > b) {
                    b = x;
                }
                if (x < l) {
                    l = x;
                }
                i++;
            } else{
                JOptionPane.showMessageDialog(null, "Insira um valor");
            }
        }
        JOptionPane.showMessageDialog(null,"O maior valor é "+b+" e o menor é "+l);
    }
}
