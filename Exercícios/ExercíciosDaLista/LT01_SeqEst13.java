/**
 * LT01_EstSeq13
 */
import javax.swing.JOptionPane;
public class LT01_SeqEst13 {
    public static void main(String[] args) {
        int kg, d;
        kg = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade em quilogramas"));
        d = (2 * kg);
        JOptionPane.showMessageDialog(null, "O alimento durará "+d+" dias.");
    }
}
