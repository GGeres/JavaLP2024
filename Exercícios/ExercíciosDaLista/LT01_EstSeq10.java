/**
 * LT01_EstSeq10
 */
import javax.swing.JOptionPane;
public class LT01_EstSeq10 {
    public static void main(String[] args) {
        double x,y,z;
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número"));
        z = x - y;
        JOptionPane.showMessageDialog(null,"O resultado da diferença é igual a "+ z);
    }
}
