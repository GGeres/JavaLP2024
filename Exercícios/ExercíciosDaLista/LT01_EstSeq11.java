/**
 * LT01_EstSeq11
 */
import javax.swing.JOptionPane;
public class LT01_EstSeq11 {
    public static void main(String[] args) {
        int r;
        double C;
        r = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do raio"));
        C = 2 * r * 3.14;
        JOptionPane.showMessageDialog(null, "O tamanho da circunferência é de aproximadamente: "+ C);
    }
}
