/**
 * LT01_EstSeq05
 */
import javax.swing.JOptionPane;
public class LT01_EstSeq05 {
    public static void main(String[] args) {
        double x1, x2, a, b, c;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C"));

        x1 = (((-b + Math.sqrt(b*b - 4*a*c))/2*a));
        x2 = (((-b - Math.sqrt(b*b - 4*a*c))/2*a));

        JOptionPane.showMessageDialog(null,"As raízes são "+x1+" e "+x2);
    }
}
