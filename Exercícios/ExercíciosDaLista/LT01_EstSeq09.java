/**
 * LT01_EstSeq09
 */
import javax.swing.JOptionPane;
public class LT01_EstSeq09 {
    public static void main(String args[]){
        int x, y, a, b, c;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y"));
        a = x * x;
        b = y * y;
        c = a + b;
        JOptionPane.showMessageDialog(null,"A soma dos quadrados é igual a "+ c);
    }
}