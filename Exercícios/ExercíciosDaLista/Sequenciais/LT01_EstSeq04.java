/**
 * LT01_EstSeq04
 */
import javax.swing.JOptionPane;
public class LT01_EstSeq04 {
    public static void main(String[] args) {
        double temp_F, temp_C;
        temp_C = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura em Celsius"));
        temp_F = ((temp_C * 9 + 160)/5);
        JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: "+temp_F+" °F");
    }
}
