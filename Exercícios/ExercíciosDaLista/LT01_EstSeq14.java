/**
 * LT01_EstSeq14
 */
import javax.swing.JOptionPane;
public class LT01_EstSeq14 {
    public static void main(String[] args) {
        int a, b, c;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro ângulo"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo ângulo"));
        c = (180 - (a + b));
        JOptionPane.showMessageDialog(null, "O valor do terceiro ângulo é de "+c+"°.");
    }
}
