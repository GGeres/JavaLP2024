/**
 * 
 * Gustavo Jorge Geres
 * 
 * LT01_EstMod19
 * Receba 2 valores reais. Calcule e mostre o maior deles. 
 * 29/08/2024
 * 
 */
import javax.swing.JOptionPane;
public class LT01_EstMod19 {
    static Long x, y, z;
    public static void main(String[] args) {
        x = Long.parseLong(JOptionPane.showInputDialog("Digite um número"));
        y = Long.parseLong(JOptionPane.showInputDialog("Digite outro número"));
        VerifMaiorMenor();
        JOptionPane.showMessageDialog(null, "O maior valor é "+z);
    }
    
    static void VerifMaiorMenor(){
        if (x > y) {
            z = x;
        } else{
            z = y;
        }
    }
}
