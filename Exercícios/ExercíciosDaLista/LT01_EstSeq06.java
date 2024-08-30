/**
 * LT01_EstSeq06
 */
import javax.swing.JOptionPane;
public class LT01_EstSeq06 {
    public static void main(String[] args) {
        int x, y, z;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor"));
        z = x;
        x = y;
        y = z;
        JOptionPane.showMessageDialog(null, "Os valores de x = "+x+" e y = "+y);
    }
}
