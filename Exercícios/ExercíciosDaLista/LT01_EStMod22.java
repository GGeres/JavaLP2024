/**
 * 
 * Gustavo Jorge Geres
 * 
 * LT01_EstMod22
 * Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente. 
 * 29/08/2024
 * 
 */
import javax.swing.JOptionPane;
public class LT01_EStMod22 {
    static int x, y;
    public static void main(String[] args) {
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        Verificador();
    }

    static void Verificador(){
        if (x != y) {
            if (x > y) {
                JOptionPane.showMessageDialog(null, y+", "+x);
            } else{
                JOptionPane.showMessageDialog(null, x+", "+y);
            }
        } else{
            JOptionPane.showMessageDialog(null, "Valores iguais");
        }
        
    }
}
