/**
 * 
 * Gustavo Jorge Geres
 * 
 * LT01_EstMod26
 * Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.   
 * 12/09/2024
 * 
 **/
import javax.swing.JOptionPane;
public class LT01_EstMod26 {
    static int x, y, z;
    public static void main(String[] args) {
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor"));
        Verificador();
    }

    static void Verificador(){
        if (x >= y) {
            z = x % y;
        } else{
            z = y % x;
        }
        if (z == 0) {
            JOptionPane.showMessageDialog(null,"O maior é múltiplo do menor");
        } else{
            JOptionPane.showMessageDialog(null,"O maior não é múltiplo do menor");
        }
    }
}
