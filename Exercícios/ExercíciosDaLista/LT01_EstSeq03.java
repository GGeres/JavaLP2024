/**
 * LT01_EstSeq03
 */
import javax.swing.JOptionPane;
public class LT01_EstSeq03 {
    public static void main(String Args []){
        int base, high;
        double area;
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da Base"));
        high = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura"));
        area = (base*high/2);
        JOptionPane.showMessageDialog(null,"A área do triâgulo é de "+area+" m2");
    }
}
