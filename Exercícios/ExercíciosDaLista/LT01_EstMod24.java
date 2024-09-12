/**
 * 
 * Gustavo Jorge Geres
 * 
 * LT01_EstMod24
 * Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.  
 * 12/09/2024
 * 
 **/
import javax.swing.JOptionPane;
public class LT01_EstMod24 {
    static int y, x;
    public static void main(String[] args) {
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        Rest6();
    }

    static void Rest6(){
        y = x % 6;
        if (y == 0) {
            JOptionPane.showMessageDialog(null, "O valor é divisível por 6");
        } else{
            JOptionPane.showMessageDialog(null, "O valor não é divisível por 6");
        }
    }
}
