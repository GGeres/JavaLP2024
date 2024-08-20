/**
 * LT01_EstSeq07
 */
import javax.swing.JOptionPane;
public class LT01_EstSeq07 {
    public static void main(String[] args) {
        int c, l, a, vol;
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do comprimento"));
        l = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da largura"));
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura"));
        vol = (c * l * a);
        JOptionPane.showMessageDialog(null, "O volume do paralelepípedo é de "+vol+" cm³");
    }
}
