/**
 * LT01_EstSeq15
 */
import javax.swing.JOptionPane;
public class LT01_EstSeq15 {
    public static void main(String[] args) {
        int a, b;
        double x, y, hip;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro cateto"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo cateto"));
        x = a * a;
        y = b * b;
        hip = Math.sqrt((x + y));
        JOptionPane.showMessageDialog(null, "O valor da hipotenusa é de "+ hip);
    }
}
